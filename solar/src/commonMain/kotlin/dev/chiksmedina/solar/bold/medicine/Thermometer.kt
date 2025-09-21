package dev.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MedicineGroup

val MedicineGroup.Thermometer: ImageVector
    get() {
        if (_thermometer != null) {
            return _thermometer!!
        }
        _thermometer = Builder(
            name = "Thermometer", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.9623f, 20.1739f)
                lineTo(5.5787f, 20.5576f)
                curveTo(4.9887f, 21.1475f, 4.0323f, 21.1475f, 3.4424f, 20.5576f)
                curveTo(2.8525f, 19.9677f, 2.8525f, 19.0112f, 3.4424f, 18.4213f)
                lineTo(3.8261f, 18.0377f)
                curveTo(4.2587f, 17.6051f, 4.4712f, 16.9992f, 4.4036f, 16.3911f)
                lineTo(4.3148f, 15.592f)
                curveTo(4.2135f, 14.6799f, 4.5323f, 13.7711f, 5.1812f, 13.1222f)
                lineTo(14.1236f, 4.1798f)
                curveTo(15.6967f, 2.6067f, 18.2471f, 2.6067f, 19.8202f, 4.1798f)
                curveTo(21.3933f, 5.7529f, 21.3933f, 8.3033f, 19.8202f, 9.8764f)
                lineTo(18.9265f, 10.7701f)
                lineTo(17.626f, 9.4697f)
                curveTo(17.3331f, 9.1768f, 16.8583f, 9.1768f, 16.5654f, 9.4697f)
                curveTo(16.2725f, 9.7626f, 16.2725f, 10.2374f, 16.5654f, 10.5303f)
                lineTo(17.8658f, 11.8308f)
                lineTo(15.7271f, 13.9696f)
                lineTo(14.4266f, 12.6691f)
                curveTo(14.1337f, 12.3762f, 13.6588f, 12.3762f, 13.3659f, 12.6691f)
                curveTo(13.0731f, 12.962f, 13.0731f, 13.4369f, 13.3659f, 13.7298f)
                lineTo(14.6664f, 15.0302f)
                lineTo(12.5178f, 17.1788f)
                lineTo(11.2173f, 15.8784f)
                curveTo(10.9244f, 15.5855f, 10.4496f, 15.5855f, 10.1567f, 15.8784f)
                curveTo(9.8638f, 16.1713f, 9.8638f, 16.6461f, 10.1567f, 16.939f)
                lineTo(11.4571f, 18.2395f)
                lineTo(10.8778f, 18.8188f)
                curveTo(10.2289f, 19.4677f, 9.3201f, 19.7865f, 8.408f, 19.6851f)
                lineTo(7.6089f, 19.5964f)
                curveTo(7.0008f, 19.5288f, 6.3949f, 19.7413f, 5.9623f, 20.1739f)
                close()
                moveTo(16.0303f, 9.0303f)
                curveTo(16.3232f, 8.7374f, 16.3232f, 8.2626f, 16.0303f, 7.9697f)
                curveTo(15.7374f, 7.6768f, 15.2626f, 7.6768f, 14.9697f, 7.9697f)
                lineTo(8.4697f, 14.4697f)
                curveTo(8.1768f, 14.7626f, 8.1768f, 15.2374f, 8.4697f, 15.5303f)
                curveTo(8.7626f, 15.8232f, 9.2374f, 15.8232f, 9.5303f, 15.5303f)
                lineTo(16.0303f, 9.0303f)
                close()
            }
        }
            .build()
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
