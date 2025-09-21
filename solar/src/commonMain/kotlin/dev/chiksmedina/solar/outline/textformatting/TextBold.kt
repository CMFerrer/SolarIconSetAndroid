package dev.chiksmedina.solar.outline.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.TextFormattingGroup

val TextFormattingGroup.TextBold: ImageVector
    get() {
        if (_textBold != null) {
            return _textBold!!
        }
        _textBold = Builder(
            name = "TextBold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(7.6087f, 1.25f)
                curveTo(5.7537f, 1.25f, 4.25f, 2.7537f, 4.25f, 4.6087f)
                verticalLineTo(19.9412f)
                curveTo(4.25f, 21.4924f, 5.5075f, 22.75f, 7.0588f, 22.75f)
                horizontalLineTo(14.0f)
                curveTo(17.1756f, 22.75f, 19.75f, 20.1756f, 19.75f, 17.0f)
                curveTo(19.75f, 14.3824f, 18.0008f, 12.1732f, 15.6076f, 11.4777f)
                curveTo(16.9142f, 10.4237f, 17.75f, 8.8095f, 17.75f, 7.0f)
                curveTo(17.75f, 3.8244f, 15.1756f, 1.25f, 12.0f, 1.25f)
                horizontalLineTo(7.6087f)
                close()
                moveTo(12.0f, 11.25f)
                curveTo(14.3472f, 11.25f, 16.25f, 9.3472f, 16.25f, 7.0f)
                curveTo(16.25f, 4.6528f, 14.3472f, 2.75f, 12.0f, 2.75f)
                horizontalLineTo(7.6087f)
                curveTo(6.5822f, 2.75f, 5.75f, 3.5822f, 5.75f, 4.6087f)
                verticalLineTo(11.25f)
                horizontalLineTo(12.0f)
                close()
                moveTo(5.75f, 12.75f)
                verticalLineTo(19.9412f)
                curveTo(5.75f, 20.664f, 6.336f, 21.25f, 7.0588f, 21.25f)
                horizontalLineTo(14.0f)
                curveTo(16.3472f, 21.25f, 18.25f, 19.3472f, 18.25f, 17.0f)
                curveTo(18.25f, 14.6528f, 16.3472f, 12.75f, 14.0f, 12.75f)
                horizontalLineTo(5.75f)
                close()
            }
        }
            .build()
        return _textBold!!
    }

private var _textBold: ImageVector? = null
