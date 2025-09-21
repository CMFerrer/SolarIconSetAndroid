package dev.chiksmedina.solar.bold.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MoneyGroup

val MoneyGroup.BillCross: ImageVector
    get() {
        if (_billCross != null) {
            return _billCross!!
        }
        _billCross = Builder(
            name = "BillCross", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.3333f, 2.0f)
                horizontalLineTo(17.6667f)
                curveTo(17.9762f, 2.0f, 18.131f, 2.0f, 18.2615f, 2.012f)
                curveTo(19.7118f, 2.1451f, 20.8617f, 3.3516f, 20.9886f, 4.8732f)
                curveTo(21.0f, 5.0101f, 21.0f, 5.1725f, 21.0f, 5.4973f)
                verticalLineTo(20.2598f)
                curveTo(21.0f, 21.1323f, 19.9413f, 21.5026f, 19.4423f, 20.8045f)
                curveTo(19.0962f, 20.3203f, 18.4038f, 20.3203f, 18.0577f, 20.8045f)
                lineTo(17.625f, 21.4098f)
                curveTo(17.0625f, 22.1967f, 15.9375f, 22.1967f, 15.375f, 21.4098f)
                curveTo(14.8125f, 20.623f, 13.6875f, 20.623f, 13.125f, 21.4098f)
                curveTo(12.5625f, 22.1967f, 11.4375f, 22.1967f, 10.875f, 21.4098f)
                curveTo(10.3125f, 20.623f, 9.1875f, 20.623f, 8.625f, 21.4098f)
                curveTo(8.0625f, 22.1967f, 6.9375f, 22.1967f, 6.375f, 21.4098f)
                lineTo(5.9423f, 20.8045f)
                curveTo(5.5961f, 20.3203f, 4.9039f, 20.3203f, 4.5577f, 20.8045f)
                curveTo(4.0587f, 21.5026f, 3.0f, 21.1323f, 3.0f, 20.2598f)
                verticalLineTo(5.4973f)
                curveTo(3.0f, 5.1725f, 3.0f, 5.0101f, 3.0114f, 4.8732f)
                curveTo(3.1383f, 3.3516f, 4.2882f, 2.1451f, 5.7385f, 2.012f)
                curveTo(5.869f, 2.0f, 6.0238f, 2.0f, 6.3333f, 2.0f)
                close()
                moveTo(10.5303f, 7.4697f)
                curveTo(10.2375f, 7.1768f, 9.7626f, 7.1768f, 9.4697f, 7.4697f)
                curveTo(9.1768f, 7.7626f, 9.1768f, 8.2374f, 9.4697f, 8.5303f)
                lineTo(10.9394f, 10.0f)
                lineTo(9.4697f, 11.4697f)
                curveTo(9.1768f, 11.7626f, 9.1768f, 12.2374f, 9.4697f, 12.5303f)
                curveTo(9.7626f, 12.8232f, 10.2375f, 12.8232f, 10.5304f, 12.5303f)
                lineTo(12.0f, 11.0607f)
                lineTo(13.4697f, 12.5303f)
                curveTo(13.7626f, 12.8232f, 14.2374f, 12.8232f, 14.5303f, 12.5303f)
                curveTo(14.8232f, 12.2374f, 14.8232f, 11.7625f, 14.5303f, 11.4697f)
                lineTo(13.0607f, 10.0f)
                lineTo(14.5303f, 8.5303f)
                curveTo(14.8232f, 8.2374f, 14.8232f, 7.7626f, 14.5303f, 7.4697f)
                curveTo(14.2375f, 7.1768f, 13.7626f, 7.1768f, 13.4697f, 7.4697f)
                lineTo(12.0f, 8.9394f)
                lineTo(10.5303f, 7.4697f)
                close()
                moveTo(7.5f, 14.75f)
                curveTo(7.0858f, 14.75f, 6.75f, 15.0858f, 6.75f, 15.5f)
                curveTo(6.75f, 15.9142f, 7.0858f, 16.25f, 7.5f, 16.25f)
                horizontalLineTo(16.5f)
                curveTo(16.9142f, 16.25f, 17.25f, 15.9142f, 17.25f, 15.5f)
                curveTo(17.25f, 15.0858f, 16.9142f, 14.75f, 16.5f, 14.75f)
                horizontalLineTo(7.5f)
                close()
            }
        }
            .build()
        return _billCross!!
    }

private var _billCross: ImageVector? = null
