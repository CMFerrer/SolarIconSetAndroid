package dev.chiksmedina.solar.bold.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MoneyGroup

val MoneyGroup.CardTransfer: ImageVector
    get() {
        if (_cardTransfer != null) {
            return _cardTransfer!!
        }
        _cardTransfer = Builder(
            name = "CardTransfer", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 4.0f, 19.6569f, 4.0f, 20.8284f, 5.1716f)
                curveTo(21.672f, 6.0151f, 21.9082f, 7.2288f, 21.9743f, 9.25f)
                horizontalLineTo(2.0257f)
                curveTo(2.0919f, 7.2288f, 2.328f, 6.0151f, 3.1716f, 5.1716f)
                curveTo(4.3432f, 4.0f, 6.2288f, 4.0f, 10.0f, 4.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(21.9995f, 12.8175f)
                lineTo(21.591f, 12.409f)
                curveTo(20.7123f, 11.5303f, 19.2877f, 11.5303f, 18.409f, 12.409f)
                lineTo(17.6076f, 13.2104f)
                curveTo(17.2878f, 12.3573f, 16.4648f, 11.75f, 15.5f, 11.75f)
                curveTo(14.2574f, 11.75f, 13.25f, 12.7574f, 13.25f, 14.0f)
                verticalLineTo(15.7638f)
                curveTo(12.7601f, 15.8183f, 12.2847f, 16.0334f, 11.909f, 16.409f)
                curveTo(11.0303f, 17.2877f, 11.0303f, 18.7123f, 11.909f, 19.591f)
                lineTo(12.318f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 20.0f, 4.3432f, 20.0f, 3.1716f, 18.8284f)
                curveTo(2.0f, 17.6569f, 2.0f, 15.7712f, 2.0f, 12.0f)
                curveTo(2.0f, 11.5581f, 2.0f, 11.142f, 2.0019f, 10.75f)
                horizontalLineTo(21.9981f)
                curveTo(22.0f, 11.142f, 22.0f, 11.5581f, 22.0f, 12.0f)
                curveTo(22.0f, 12.283f, 22.0f, 12.5553f, 21.9995f, 12.8175f)
                close()
                moveTo(6.0f, 15.25f)
                curveTo(5.5858f, 15.25f, 5.25f, 15.5858f, 5.25f, 16.0f)
                curveTo(5.25f, 16.4142f, 5.5858f, 16.75f, 6.0f, 16.75f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 16.75f, 10.75f, 16.4142f, 10.75f, 16.0f)
                curveTo(10.75f, 15.5858f, 10.4142f, 15.25f, 10.0f, 15.25f)
                horizontalLineTo(6.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.5f, 13.25f)
                curveTo(15.9142f, 13.25f, 16.25f, 13.5858f, 16.25f, 14.0f)
                verticalLineTo(18.1893f)
                lineTo(16.9697f, 17.4697f)
                curveTo(17.2626f, 17.1768f, 17.7374f, 17.1768f, 18.0303f, 17.4697f)
                curveTo(18.3232f, 17.7626f, 18.3232f, 18.2374f, 18.0303f, 18.5303f)
                lineTo(16.0303f, 20.5303f)
                curveTo(15.7374f, 20.8232f, 15.2626f, 20.8232f, 14.9697f, 20.5303f)
                lineTo(12.9697f, 18.5303f)
                curveTo(12.6768f, 18.2374f, 12.6768f, 17.7626f, 12.9697f, 17.4697f)
                curveTo(13.2626f, 17.1768f, 13.7374f, 17.1768f, 14.0303f, 17.4697f)
                lineTo(14.75f, 18.1893f)
                verticalLineTo(14.0f)
                curveTo(14.75f, 13.5858f, 15.0858f, 13.25f, 15.5f, 13.25f)
                close()
                moveTo(19.4697f, 13.4697f)
                curveTo(19.7626f, 13.1768f, 20.2374f, 13.1768f, 20.5303f, 13.4697f)
                lineTo(22.5303f, 15.4697f)
                curveTo(22.8232f, 15.7626f, 22.8232f, 16.2374f, 22.5303f, 16.5303f)
                curveTo(22.2374f, 16.8232f, 21.7626f, 16.8232f, 21.4697f, 16.5303f)
                lineTo(20.75f, 15.8107f)
                verticalLineTo(20.0f)
                curveTo(20.75f, 20.4142f, 20.4142f, 20.75f, 20.0f, 20.75f)
                curveTo(19.5858f, 20.75f, 19.25f, 20.4142f, 19.25f, 20.0f)
                verticalLineTo(15.8107f)
                lineTo(18.5303f, 16.5303f)
                curveTo(18.2374f, 16.8232f, 17.7626f, 16.8232f, 17.4697f, 16.5303f)
                curveTo(17.1768f, 16.2374f, 17.1768f, 15.7626f, 17.4697f, 15.4697f)
                lineTo(19.4697f, 13.4697f)
                close()
            }
        }
            .build()
        return _cardTransfer!!
    }

private var _cardTransfer: ImageVector? = null
