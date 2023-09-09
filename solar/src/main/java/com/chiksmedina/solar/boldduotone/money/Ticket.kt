package com.chiksmedina.solar.boldduotone.money

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
import com.chiksmedina.solar.boldduotone.MoneyGroup

public val MoneyGroup.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(name = "Ticket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0137f, 17.0f)
                lineTo(14.0079f, 19.0029f)
                curveTo(14.0065f, 19.4731f, 14.0058f, 19.7081f, 13.8591f, 19.8541f)
                curveTo(13.7124f, 20.0f, 13.4767f, 20.0f, 13.0054f, 20.0f)
                horizontalLineTo(9.995f)
                curveTo(6.2144f, 20.0f, 4.3241f, 20.0f, 3.1496f, 18.8284f)
                curveTo(2.3409f, 18.0218f, 2.089f, 16.8766f, 2.0106f, 15.0105f)
                curveTo(1.995f, 14.6405f, 1.9872f, 14.4554f, 2.0563f, 14.332f)
                curveTo(2.1254f, 14.2085f, 2.4013f, 14.0545f, 2.9531f, 13.7463f)
                curveTo(3.5659f, 13.4041f, 3.9801f, 12.7503f, 3.9801f, 12.0f)
                curveTo(3.9801f, 11.2497f, 3.5659f, 10.5959f, 2.9531f, 10.2537f)
                curveTo(2.4013f, 9.9455f, 2.1254f, 9.7915f, 2.0563f, 9.668f)
                curveTo(1.9872f, 9.5446f, 1.995f, 9.3595f, 2.0106f, 8.9895f)
                curveTo(2.089f, 7.1234f, 2.3409f, 5.9782f, 3.1496f, 5.1716f)
                curveTo(4.3241f, 4.0f, 6.2144f, 4.0f, 9.995f, 4.0f)
                horizontalLineTo(13.5052f)
                curveTo(13.7814f, 4.0f, 14.0056f, 4.223f, 14.0064f, 4.4985f)
                lineTo(14.0137f, 7.0f)
                curveTo(14.0137f, 7.5523f, 14.4625f, 8.0f, 15.0162f, 8.0f)
                lineTo(15.0162f, 10.0f)
                curveTo(14.4625f, 10.0f, 14.0137f, 10.4477f, 14.0137f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(14.0137f, 13.5523f, 14.4625f, 14.0f, 15.0162f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(14.4625f, 16.0f, 14.0137f, 16.4477f, 14.0137f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0166f, 15.9998f)
                curveTo(15.5703f, 15.9998f, 16.0191f, 16.4475f, 16.0191f, 16.9998f)
                verticalLineTo(18.9763f)
                curveTo(16.0191f, 19.4578f, 16.0191f, 19.6986f, 16.1735f, 19.8462f)
                curveTo(16.3279f, 19.9939f, 16.5641f, 19.9839f, 17.0366f, 19.9639f)
                curveTo(18.8995f, 19.885f, 20.0441f, 19.633f, 20.8508f, 18.8282f)
                curveTo(21.6595f, 18.0216f, 21.9114f, 16.8764f, 21.9898f, 15.0104f)
                curveTo(22.0054f, 14.6403f, 22.0132f, 14.4552f, 21.9441f, 14.3318f)
                curveTo(21.875f, 14.2083f, 21.5991f, 14.0543f, 21.0473f, 13.7462f)
                curveTo(20.4346f, 13.404f, 20.0203f, 12.7501f, 20.0203f, 11.9998f)
                curveTo(20.0203f, 11.2495f, 20.4346f, 10.5957f, 21.0473f, 10.2535f)
                curveTo(21.5991f, 9.9454f, 21.875f, 9.7913f, 21.9441f, 9.6678f)
                curveTo(22.0132f, 9.5444f, 22.0054f, 9.3594f, 21.9898f, 8.9893f)
                curveTo(21.9114f, 7.1232f, 21.6595f, 5.9781f, 20.8508f, 5.1714f)
                curveTo(19.9731f, 4.2959f, 18.6956f, 4.0746f, 16.5282f, 4.0187f)
                curveTo(16.2486f, 4.0115f, 16.0191f, 4.237f, 16.0191f, 4.516f)
                verticalLineTo(6.9998f)
                curveTo(16.0191f, 7.5521f, 15.5703f, 7.9998f, 15.0166f, 7.9998f)
                lineTo(15.0166f, 9.9998f)
                curveTo(15.5703f, 9.9998f, 16.0191f, 10.4475f, 16.0191f, 10.9998f)
                verticalLineTo(12.9998f)
                curveTo(16.0191f, 13.5521f, 15.5703f, 13.9998f, 15.0166f, 13.9998f)
                verticalLineTo(15.9998f)
                close()
            }
        }
        .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
