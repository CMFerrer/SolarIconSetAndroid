package com.chiksmedina.solar.outline.textformatting

import androidx.compose.ui.graphics.Color
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
import com.chiksmedina.solar.outline.TextFormattingGroup

public val TextFormattingGroup.TextSelection: ImageVector
    get() {
        if (_textSelection != null) {
            return _textSelection!!
        }
        _textSelection = Builder(name = "TextSelection", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 8.25f)
                curveTo(8.5858f, 8.25f, 8.25f, 8.5858f, 8.25f, 9.0f)
                curveTo(8.25f, 9.4142f, 8.5858f, 9.75f, 9.0f, 9.75f)
                horizontalLineTo(11.25f)
                lineTo(11.25f, 15.0f)
                curveTo(11.25f, 15.4142f, 11.5858f, 15.75f, 12.0f, 15.75f)
                curveTo(12.4142f, 15.75f, 12.75f, 15.4142f, 12.75f, 15.0f)
                lineTo(12.75f, 9.75f)
                horizontalLineTo(15.0f)
                curveTo(15.4142f, 9.75f, 15.75f, 9.4142f, 15.75f, 9.0f)
                curveTo(15.75f, 8.5858f, 15.4142f, 8.25f, 15.0f, 8.25f)
                horizontalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.25f, 6.6465f)
                curveTo(2.0958f, 6.32f, 1.25f, 5.2588f, 1.25f, 4.0f)
                curveTo(1.25f, 2.4812f, 2.4812f, 1.25f, 4.0f, 1.25f)
                curveTo(5.2588f, 1.25f, 6.32f, 2.0958f, 6.6465f, 3.25f)
                horizontalLineTo(17.3535f)
                curveTo(17.68f, 2.0958f, 18.7412f, 1.25f, 20.0f, 1.25f)
                curveTo(21.5188f, 1.25f, 22.75f, 2.4812f, 22.75f, 4.0f)
                curveTo(22.75f, 5.2588f, 21.9043f, 6.32f, 20.75f, 6.6465f)
                verticalLineTo(17.3535f)
                curveTo(21.9043f, 17.68f, 22.75f, 18.7412f, 22.75f, 20.0f)
                curveTo(22.75f, 21.5188f, 21.5188f, 22.75f, 20.0f, 22.75f)
                curveTo(18.7412f, 22.75f, 17.68f, 21.9043f, 17.3535f, 20.75f)
                horizontalLineTo(6.6465f)
                curveTo(6.32f, 21.9043f, 5.2588f, 22.75f, 4.0f, 22.75f)
                curveTo(2.4812f, 22.75f, 1.25f, 21.5188f, 1.25f, 20.0f)
                curveTo(1.25f, 18.7412f, 2.0958f, 17.68f, 3.25f, 17.3535f)
                lineTo(3.25f, 6.6465f)
                close()
                moveTo(4.0f, 2.75f)
                curveTo(3.3096f, 2.75f, 2.75f, 3.3096f, 2.75f, 4.0f)
                curveTo(2.75f, 4.6904f, 3.3096f, 5.25f, 4.0f, 5.25f)
                curveTo(4.6904f, 5.25f, 5.25f, 4.6904f, 5.25f, 4.0f)
                curveTo(5.25f, 3.3096f, 4.6904f, 2.75f, 4.0f, 2.75f)
                close()
                moveTo(4.75f, 17.3535f)
                lineTo(4.75f, 6.6465f)
                curveTo(5.6658f, 6.3875f, 6.3875f, 5.6658f, 6.6465f, 4.75f)
                horizontalLineTo(17.3535f)
                curveTo(17.6125f, 5.6658f, 18.3342f, 6.3875f, 19.25f, 6.6465f)
                verticalLineTo(17.3535f)
                curveTo(18.3342f, 17.6125f, 17.6125f, 18.3342f, 17.3535f, 19.25f)
                horizontalLineTo(6.6465f)
                curveTo(6.3875f, 18.3342f, 5.6658f, 17.6125f, 4.75f, 17.3535f)
                close()
                moveTo(4.0f, 18.75f)
                curveTo(3.3096f, 18.75f, 2.75f, 19.3096f, 2.75f, 20.0f)
                curveTo(2.75f, 20.6904f, 3.3096f, 21.25f, 4.0f, 21.25f)
                curveTo(4.6904f, 21.25f, 5.25f, 20.6904f, 5.25f, 20.0f)
                curveTo(5.25f, 19.3096f, 4.6904f, 18.75f, 4.0f, 18.75f)
                close()
                moveTo(21.25f, 4.0f)
                curveTo(21.25f, 4.6904f, 20.6904f, 5.25f, 20.0f, 5.25f)
                curveTo(19.3096f, 5.25f, 18.75f, 4.6904f, 18.75f, 4.0f)
                curveTo(18.75f, 3.3096f, 19.3096f, 2.75f, 20.0f, 2.75f)
                curveTo(20.6904f, 2.75f, 21.25f, 3.3096f, 21.25f, 4.0f)
                close()
                moveTo(18.75f, 20.0f)
                curveTo(18.75f, 19.3096f, 19.3096f, 18.75f, 20.0f, 18.75f)
                curveTo(20.6904f, 18.75f, 21.25f, 19.3096f, 21.25f, 20.0f)
                curveTo(21.25f, 20.6904f, 20.6904f, 21.25f, 20.0f, 21.25f)
                curveTo(19.3096f, 21.25f, 18.75f, 20.6904f, 18.75f, 20.0f)
                close()
            }
        }
        .build()
        return _textSelection!!
    }

private var _textSelection: ImageVector? = null
