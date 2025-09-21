package dev.chiksmedina.solar.outline.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MedicineGroup

val MedicineGroup.TestTubeMinimalistic: ImageVector
    get() {
        if (_testTubeMinimalistic != null) {
            return _testTubeMinimalistic!!
        }
        _testTubeMinimalistic = Builder(
            name = "TestTubeMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.6523f, 2.4685f)
                curveTo(13.9459f, 2.1762f, 14.4208f, 2.1773f, 14.713f, 2.4708f)
                lineTo(21.5315f, 9.3195f)
                curveTo(21.8237f, 9.6131f, 21.8227f, 10.0879f, 21.5292f, 10.3802f)
                curveTo(21.2356f, 10.6724f, 20.7607f, 10.6714f, 20.4685f, 10.3778f)
                lineTo(20.2387f, 10.147f)
                lineTo(10.0199f, 20.411f)
                curveTo(8.2424f, 22.1963f, 5.3592f, 22.1963f, 3.5817f, 20.411f)
                curveTo(1.8061f, 18.6275f, 1.8061f, 15.7372f, 3.5817f, 13.9538f)
                lineTo(6.2642f, 11.2594f)
                curveTo(6.2674f, 11.2562f, 6.2705f, 11.253f, 6.2737f, 11.2499f)
                lineTo(13.8052f, 3.685f)
                lineTo(13.65f, 3.5292f)
                curveTo(13.3578f, 3.2356f, 13.3588f, 2.7608f, 13.6523f, 2.4685f)
                close()
                moveTo(14.8635f, 4.7481f)
                lineTo(8.4189f, 11.2212f)
                curveTo(9.6666f, 11.4744f, 10.6219f, 12.51f, 10.7641f, 13.7955f)
                curveTo(10.822f, 14.318f, 11.154f, 14.7673f, 11.6312f, 14.9744f)
                lineTo(12.8232f, 15.4692f)
                lineTo(19.1803f, 9.084f)
                lineTo(14.8635f, 4.7481f)
                close()
                moveTo(11.6791f, 16.6184f)
                lineTo(11.0421f, 16.354f)
                curveTo(10.0649f, 15.9333f, 9.3903f, 15.0183f, 9.2732f, 13.9604f)
                curveTo(9.1979f, 13.2796f, 8.6637f, 12.746f, 7.9918f, 12.671f)
                lineTo(7.0771f, 12.5689f)
                lineTo(4.6447f, 15.0121f)
                curveTo(3.4518f, 16.2103f, 3.4518f, 18.1544f, 4.6447f, 19.3527f)
                curveTo(5.8359f, 20.5491f, 7.7657f, 20.5491f, 8.9569f, 19.3527f)
                lineTo(11.6791f, 16.6184f)
                close()
            }
        }
            .build()
        return _testTubeMinimalistic!!
    }

private var _testTubeMinimalistic: ImageVector? = null
