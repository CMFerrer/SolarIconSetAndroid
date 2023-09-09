package com.chiksmedina.solar.bold.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.TextFormattingGroup

public val TextFormattingGroup.TextUnderlineCross: ImageVector
    get() {
        if (_textUnderlineCross != null) {
            return _textUnderlineCross!!
        }
        _textUnderlineCross = Builder(name = "TextUnderlineCross", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                close()
                moveTo(7.25f, 17.0f)
                curveTo(7.25f, 16.5858f, 7.5858f, 16.25f, 8.0f, 16.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 16.25f, 16.75f, 16.5858f, 16.75f, 17.0f)
                curveTo(16.75f, 17.4142f, 16.4142f, 17.75f, 16.0f, 17.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 17.75f, 7.25f, 17.4142f, 7.25f, 17.0f)
                close()
                moveTo(8.75f, 7.0f)
                curveTo(8.75f, 6.5858f, 8.4142f, 6.25f, 8.0f, 6.25f)
                curveTo(7.5858f, 6.25f, 7.25f, 6.5858f, 7.25f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(7.25f, 12.6234f, 9.3766f, 14.75f, 12.0f, 14.75f)
                curveTo(14.6234f, 14.75f, 16.75f, 12.6234f, 16.75f, 10.0f)
                verticalLineTo(7.0f)
                curveTo(16.75f, 6.5858f, 16.4142f, 6.25f, 16.0f, 6.25f)
                curveTo(15.5858f, 6.25f, 15.25f, 6.5858f, 15.25f, 7.0f)
                verticalLineTo(10.0f)
                curveTo(15.25f, 11.7949f, 13.7949f, 13.25f, 12.0f, 13.25f)
                curveTo(10.2051f, 13.25f, 8.75f, 11.7949f, 8.75f, 10.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _textUnderlineCross!!
    }

private var _textUnderlineCross: ImageVector? = null
