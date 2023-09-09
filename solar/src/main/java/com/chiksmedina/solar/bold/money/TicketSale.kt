package com.chiksmedina.solar.bold.money

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.MoneyGroup

public val MoneyGroup.TicketSale: ImageVector
    get() {
        if (_ticketSale != null) {
            return _ticketSale!!
        }
        _ticketSale = Builder(name = "TicketSale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.995f, 4.0f)
                horizontalLineTo(14.005f)
                curveTo(17.7856f, 4.0f, 19.6759f, 4.0f, 20.8504f, 5.1716f)
                curveTo(21.6591f, 5.9782f, 21.911f, 7.1234f, 21.9894f, 8.9895f)
                curveTo(22.005f, 9.3595f, 22.0128f, 9.5446f, 21.9437f, 9.668f)
                curveTo(21.8746f, 9.7915f, 21.5987f, 9.9455f, 21.0469f, 10.2537f)
                curveTo(20.4341f, 10.5959f, 20.0199f, 11.2497f, 20.0199f, 12.0f)
                curveTo(20.0199f, 12.7503f, 20.4341f, 13.4041f, 21.0469f, 13.7463f)
                curveTo(21.5987f, 14.0545f, 21.8746f, 14.2085f, 21.9437f, 14.332f)
                curveTo(22.0128f, 14.4554f, 22.005f, 14.6405f, 21.9894f, 15.0105f)
                curveTo(21.911f, 16.8766f, 21.6591f, 18.0218f, 20.8504f, 18.8284f)
                curveTo(19.6759f, 20.0f, 17.7856f, 20.0f, 14.005f, 20.0f)
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
                close()
                moveTo(15.5478f, 8.4697f)
                curveTo(15.8415f, 8.7626f, 15.8415f, 9.2374f, 15.5478f, 9.5303f)
                lineTo(9.5329f, 15.5303f)
                curveTo(9.2393f, 15.8232f, 8.7632f, 15.8232f, 8.4696f, 15.5303f)
                curveTo(8.176f, 15.2374f, 8.176f, 14.7626f, 8.4696f, 14.4697f)
                lineTo(14.4845f, 8.4697f)
                curveTo(14.7782f, 8.1768f, 15.2542f, 8.1768f, 15.5478f, 8.4697f)
                close()
                moveTo(14.5149f, 15.5f)
                curveTo(15.0686f, 15.5f, 15.5174f, 15.0523f, 15.5174f, 14.5f)
                curveTo(15.5174f, 13.9477f, 15.0686f, 13.5f, 14.5149f, 13.5f)
                curveTo(13.9613f, 13.5f, 13.5124f, 13.9477f, 13.5124f, 14.5f)
                curveTo(13.5124f, 15.0523f, 13.9613f, 15.5f, 14.5149f, 15.5f)
                close()
                moveTo(9.5025f, 10.5f)
                curveTo(10.0561f, 10.5f, 10.505f, 10.0523f, 10.505f, 9.5f)
                curveTo(10.505f, 8.9477f, 10.0561f, 8.5f, 9.5025f, 8.5f)
                curveTo(8.9488f, 8.5f, 8.5f, 8.9477f, 8.5f, 9.5f)
                curveTo(8.5f, 10.0523f, 8.9488f, 10.5f, 9.5025f, 10.5f)
                close()
            }
        }
        .build()
        return _ticketSale!!
    }

private var _ticketSale: ImageVector? = null
