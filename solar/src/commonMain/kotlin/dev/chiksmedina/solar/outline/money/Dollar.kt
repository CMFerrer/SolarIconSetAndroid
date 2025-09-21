package dev.chiksmedina.solar.outline.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MoneyGroup

val MoneyGroup.Dollar: ImageVector
    get() {
        if (_dollar != null) {
            return _dollar!!
        }
        _dollar = Builder(
            name = "Dollar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(6.8914f, 2.75f, 2.75f, 6.8914f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1086f, 6.8914f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1086f, 21.25f, 21.25f, 17.1086f, 21.25f, 12.0f)
                curveTo(21.25f, 6.8914f, 17.1086f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(1.25f, 12.0f)
                curveTo(1.25f, 6.0629f, 6.0629f, 1.25f, 12.0f, 1.25f)
                curveTo(17.9371f, 1.25f, 22.75f, 6.0629f, 22.75f, 12.0f)
                curveTo(22.75f, 17.9371f, 17.9371f, 22.75f, 12.0f, 22.75f)
                curveTo(6.0629f, 22.75f, 1.25f, 17.9371f, 1.25f, 12.0f)
                close()
                moveTo(12.0f, 5.25f)
                curveTo(12.4142f, 5.25f, 12.75f, 5.5858f, 12.75f, 6.0f)
                verticalLineTo(6.3167f)
                curveTo(14.3804f, 6.6087f, 15.75f, 7.8336f, 15.75f, 9.5f)
                curveTo(15.75f, 9.9142f, 15.4142f, 10.25f, 15.0f, 10.25f)
                curveTo(14.5858f, 10.25f, 14.25f, 9.9142f, 14.25f, 9.5f)
                curveTo(14.25f, 8.8215f, 13.6859f, 8.1034f, 12.75f, 7.8475f)
                verticalLineTo(11.3167f)
                curveTo(14.3804f, 11.6087f, 15.75f, 12.8336f, 15.75f, 14.5f)
                curveTo(15.75f, 16.1664f, 14.3804f, 17.3913f, 12.75f, 17.6833f)
                verticalLineTo(18.0f)
                curveTo(12.75f, 18.4142f, 12.4142f, 18.75f, 12.0f, 18.75f)
                curveTo(11.5858f, 18.75f, 11.25f, 18.4142f, 11.25f, 18.0f)
                verticalLineTo(17.6833f)
                curveTo(9.6196f, 17.3913f, 8.25f, 16.1664f, 8.25f, 14.5f)
                curveTo(8.25f, 14.0858f, 8.5858f, 13.75f, 9.0f, 13.75f)
                curveTo(9.4142f, 13.75f, 9.75f, 14.0858f, 9.75f, 14.5f)
                curveTo(9.75f, 15.1785f, 10.3141f, 15.8966f, 11.25f, 16.1525f)
                verticalLineTo(12.6833f)
                curveTo(9.6196f, 12.3913f, 8.25f, 11.1664f, 8.25f, 9.5f)
                curveTo(8.25f, 7.8336f, 9.6196f, 6.6087f, 11.25f, 6.3167f)
                verticalLineTo(6.0f)
                curveTo(11.25f, 5.5858f, 11.5858f, 5.25f, 12.0f, 5.25f)
                close()
                moveTo(11.25f, 7.8475f)
                curveTo(10.3141f, 8.1034f, 9.75f, 8.8215f, 9.75f, 9.5f)
                curveTo(9.75f, 10.1785f, 10.3141f, 10.8966f, 11.25f, 11.1525f)
                verticalLineTo(7.8475f)
                close()
                moveTo(12.75f, 12.8475f)
                verticalLineTo(16.1525f)
                curveTo(13.6859f, 15.8966f, 14.25f, 15.1785f, 14.25f, 14.5f)
                curveTo(14.25f, 13.8215f, 13.6859f, 13.1034f, 12.75f, 12.8475f)
                close()
            }
        }
            .build()
        return _dollar!!
    }

private var _dollar: ImageVector? = null
