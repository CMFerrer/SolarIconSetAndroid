package com.chiksmedina.solar.linear.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.MoneyGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.6667f, 2.0f)
                horizontalLineTo(6.3333f)
                curveTo(6.0238f, 2.0f, 5.869f, 2.0f, 5.7385f, 2.012f)
                curveTo(4.2882f, 2.1451f, 3.1383f, 3.3516f, 3.0114f, 4.8732f)
                curveTo(3.0f, 5.0101f, 3.0f, 5.1725f, 3.0f, 5.4973f)
                verticalLineTo(20.2598f)
                curveTo(3.0f, 21.1323f, 4.0587f, 21.5026f, 4.5577f, 20.8045f)
                curveTo(4.9039f, 20.3203f, 5.5961f, 20.3203f, 5.9423f, 20.8045f)
                lineTo(6.375f, 21.4098f)
                curveTo(6.9375f, 22.1967f, 8.0625f, 22.1967f, 8.625f, 21.4098f)
                curveTo(9.1875f, 20.623f, 10.3125f, 20.623f, 10.875f, 21.4098f)
                curveTo(11.4375f, 22.1967f, 12.5625f, 22.1967f, 13.125f, 21.4098f)
                curveTo(13.6875f, 20.623f, 14.8125f, 20.623f, 15.375f, 21.4098f)
                curveTo(15.9375f, 22.1967f, 17.0625f, 22.1967f, 17.625f, 21.4098f)
                lineTo(18.0577f, 20.8045f)
                curveTo(18.4038f, 20.3203f, 19.0962f, 20.3203f, 19.4423f, 20.8045f)
                curveTo(19.9413f, 21.5026f, 21.0f, 21.1323f, 21.0f, 20.2598f)
                verticalLineTo(5.4973f)
                curveTo(21.0f, 5.1725f, 21.0f, 5.0101f, 20.9886f, 4.8732f)
                curveTo(20.8617f, 3.3516f, 19.7118f, 2.1451f, 18.2615f, 2.012f)
                curveTo(18.131f, 2.0f, 17.9762f, 2.0f, 17.6667f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.5f, 15.5f)
                horizontalLineTo(16.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 8.0f)
                lineTo(10.0f, 12.0f)
                moveTo(10.0f, 8.0f)
                lineTo(14.0f, 12.0f)
            }
        }
            .build()
        return _billCross!!
    }

private var _billCross: ImageVector? = null
