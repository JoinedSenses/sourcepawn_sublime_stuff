"""
BracketHighlighter.

Copyright (c) 2013 - 2016 Isaac Muse <isaacmuse@gmail.com>
License: MIT
"""
import BracketHighlighter.bh_plugin as bh_plugin
import sublime


class SwapQuotes(bh_plugin.BracketPluginCommand):
    """Swap quotes plugin."""

    def escaped(self, idx):
        """Check if character is an escape char."""

        view = self.view
        escaped = False
        while idx >= 0 and view.substr(idx) == '\\':
            escaped = ~escaped
            idx -= 1
        return escaped

    def run(self, edit, name):
        """
        Swap double or single quotes with each other.

        Handle escaping or unescaping like quotes or
        unlike quotes respectively.
        """

        view = self.view
        quote = view.substr(self.left.begin)
        if quote != "'" and quote != '"':
            return
        new = "'" if (quote == '"') else '"'
        old = quote
        begin = self.left.end
        end = self.right.begin
        content_end = self.right.begin

        view.replace(edit, self.left.toregion(), view.substr(self.left.toregion()).replace(old, new))
        view.replace(edit, self.right.toregion(), view.substr(self.right.toregion()).replace(old, new))

        offset = 0
        while begin < end + offset:
            char = view.substr(begin)
            if char == old and self.escaped(begin - 1):
                view.replace(edit, sublime.Region(begin - 1, begin), '')
                offset -= 1
                content_end -= 1
            elif char == new and not self.escaped(begin - 1):
                view.insert(edit, begin, "\\")
                offset += 1
                content_end += 1
            begin += 1

        self.right = self.right.move(content_end, end + offset)
        self.selection = [sublime.Region(content_end)]


def plugin():
    """Make plugin available."""

    return SwapQuotes
