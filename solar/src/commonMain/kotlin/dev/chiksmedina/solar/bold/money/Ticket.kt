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

val MoneyGroup.Ticket: ImageVector
    get() {
        if (_ticket != null) {
            return _ticket!!
        }
        _ticket = Builder(
            name = "Ticket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.0079f, 19.0029f)
                lineTo(14.0137f, 17.0f)
                curveTo(14.0137f, 16.4477f, 14.4625f, 16.0f, 15.0162f, 16.0f)
                curveTo(15.5698f, 16.0f, 16.0187f, 16.4477f, 16.0187f, 17.0f)
                verticalLineTo(18.9765f)
                curveTo(16.0187f, 19.458f, 16.0187f, 19.6988f, 16.1731f, 19.8464f)
                curveTo(16.3275f, 19.9941f, 16.5637f, 19.984f, 17.0362f, 19.964f)
                curveTo(18.8991f, 19.8852f, 20.0437f, 19.6332f, 20.8504f, 18.8284f)
                curveTo(21.6591f, 18.0218f, 21.911f, 16.8766f, 21.9894f, 15.0105f)
                curveTo(22.005f, 14.6405f, 22.0128f, 14.4554f, 21.9437f, 14.332f)
                curveTo(21.8746f, 14.2085f, 21.5987f, 14.0545f, 21.0469f, 13.7463f)
                curveTo(20.4341f, 13.4041f, 20.0199f, 12.7503f, 20.0199f, 12.0f)
                curveTo(20.0199f, 11.2497f, 20.4341f, 10.5959f, 21.0469f, 10.2537f)
                curveTo(21.5987f, 9.9455f, 21.8746f, 9.7915f, 21.9437f, 9.668f)
                curveTo(22.0128f, 9.5446f, 22.005f, 9.3595f, 21.9894f, 8.9895f)
                curveTo(21.911f, 7.1234f, 21.6591f, 5.9782f, 20.8504f, 5.1716f)
                curveTo(19.9727f, 4.296f, 18.6952f, 4.0748f, 16.5278f, 4.0189f)
                curveTo(16.2482f, 4.0117f, 16.0187f, 4.2372f, 16.0187f, 4.5162f)
                verticalLineTo(7.0f)
                curveTo(16.0187f, 7.5523f, 15.5698f, 8.0f, 15.0162f, 8.0f)
                curveTo(14.4625f, 8.0f, 14.0137f, 7.5523f, 14.0137f, 7.0f)
                lineTo(14.0064f, 4.4985f)
                curveTo(14.0056f, 4.223f, 13.7814f, 4.0f, 13.5052f, 4.0f)
                horizontalLineTo(9.995f)
                curveTo(6.2144f, 4.0f, 4.3241f, 4.0f, 3.1496f, 5.1716f)
                curveTo(2.3409f, 5.9782f, 2.089f, 7.1234f, 2.0106f, 8.9895f)
                curveTo(1.995f, 9.3595f, 1.9872f, 9.5446f, 2.0563f, 9.668f)
                curveTo(2.1254f, 9.7915f, 2.4013f, 9.9455f, 2.9531f, 10.2537f)
                curveTo(3.5659f, 10.5959f, 3.9801f, 11.2497f, 3.9801f, 12.0f)
                curveTo(3.9801f, 12.7503f, 3.5659f, 13.4041f, 2.9531f, 13.7463f)
                curveTo(2.4013f, 14.0545f, 2.1254f, 14.2085f, 2.0563f, 14.332f)
                curveTo(1.9872f, 14.4554f, 1.995f, 14.6405f, 2.0106f, 15.0105f)
                curveTo(2.089f, 16.8766f, 2.3409f, 18.0218f, 3.1496f, 18.8284f)
                curveTo(4.3241f, 20.0f, 6.2144f, 20.0f, 9.995f, 20.0f)
                horizontalLineTo(13.0054f)
                curveTo(13.4767f, 20.0f, 13.7124f, 20.0f, 13.8591f, 19.8541f)
                curveTo(14.0058f, 19.7081f, 14.0065f, 19.4731f, 14.0079f, 19.0029f)
                close()
                moveTo(16.0187f, 13.0f)
                verticalLineTo(11.0f)
                curveTo(16.0187f, 10.4477f, 15.5698f, 10.0f, 15.0162f, 10.0f)
                curveTo(14.4625f, 10.0f, 14.0137f, 10.4477f, 14.0137f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(14.0137f, 13.5523f, 14.4625f, 14.0f, 15.0162f, 14.0f)
                curveTo(15.5698f, 14.0f, 16.0187f, 13.5523f, 16.0187f, 13.0f)
                close()
            }
        }
            .build()
        return _ticket!!
    }

private var _ticket: ImageVector? = null
