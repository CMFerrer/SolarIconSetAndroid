package com.chiksmedina.solar.boldduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.TextFormattingGroup

public val TextFormattingGroup.Text: ImageVector
    get() {
        if (_text != null) {
            return _text!!
        }
        _text = Builder(name = "Text", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 2.0f)
                lineTo(7.9342f, 2.0f)
                curveTo(7.0477f, 2.0f, 6.2839f, 1.9999f, 5.6722f, 2.0821f)
                curveTo(5.0167f, 2.1703f, 4.3884f, 2.369f, 3.8787f, 2.8787f)
                curveTo(3.369f, 3.3884f, 3.1703f, 4.0167f, 3.0821f, 4.6722f)
                curveTo(2.9999f, 5.2839f, 2.9999f, 6.0477f, 3.0f, 6.9342f)
                lineTo(3.0f, 7.0f)
                verticalLineTo(7.95f)
                curveTo(3.0f, 8.5023f, 3.4477f, 8.95f, 4.0f, 8.95f)
                curveTo(4.5523f, 8.95f, 5.0f, 8.5023f, 5.0f, 7.95f)
                verticalLineTo(7.0f)
                curveTo(5.0f, 6.0289f, 5.0021f, 5.4012f, 5.0643f, 4.9387f)
                curveTo(5.1226f, 4.505f, 5.2168f, 4.369f, 5.2929f, 4.2929f)
                curveTo(5.369f, 4.2168f, 5.505f, 4.1226f, 5.9387f, 4.0643f)
                curveTo(6.4012f, 4.0021f, 7.0289f, 4.0f, 8.0f, 4.0f)
                horizontalLineTo(11.0f)
                horizontalLineTo(13.0f)
                horizontalLineTo(16.0f)
                curveTo(16.9711f, 4.0f, 17.5988f, 4.0021f, 18.0613f, 4.0643f)
                curveTo(18.495f, 4.1226f, 18.631f, 4.2168f, 18.7071f, 4.2929f)
                curveTo(18.7832f, 4.369f, 18.8774f, 4.505f, 18.9357f, 4.9387f)
                curveTo(18.9979f, 5.4012f, 19.0f, 6.0289f, 19.0f, 7.0f)
                verticalLineTo(7.95f)
                curveTo(19.0f, 8.5023f, 19.4477f, 8.95f, 20.0f, 8.95f)
                curveTo(20.5523f, 8.95f, 21.0f, 8.5023f, 21.0f, 7.95f)
                lineTo(21.0f, 6.9342f)
                curveTo(21.0001f, 6.0477f, 21.0001f, 5.2839f, 20.9179f, 4.6722f)
                curveTo(20.8297f, 4.0167f, 20.631f, 3.3884f, 20.1213f, 2.8787f)
                curveTo(19.6117f, 2.369f, 18.9833f, 2.1703f, 18.3278f, 2.0821f)
                curveTo(17.7161f, 1.9999f, 16.9523f, 2.0f, 16.0658f, 2.0f)
                lineTo(8.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 21.0f)
                curveTo(6.0f, 20.4477f, 6.4477f, 20.0f, 7.0f, 20.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 20.0f, 18.0f, 20.4477f, 18.0f, 21.0f)
                curveTo(18.0f, 21.5523f, 17.5523f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 22.0f, 6.0f, 21.5523f, 6.0f, 21.0f)
                close()
            }
        }
        .build()
        return _text!!
    }

private var _text: ImageVector? = null
