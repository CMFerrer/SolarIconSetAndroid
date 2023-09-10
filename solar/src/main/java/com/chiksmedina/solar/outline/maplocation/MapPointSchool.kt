package com.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MapLocationGroup

val MapLocationGroup.MapPointSchool: ImageVector
    get() {
        if (_mapPointSchool != null) {
            return _mapPointSchool!!
        }
        _mapPointSchool = Builder(
            name = "MapPointSchool", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(3.25f, 10.1433f)
                curveTo(3.25f, 5.2443f, 7.155f, 1.25f, 12.0f, 1.25f)
                curveTo(16.845f, 1.25f, 20.75f, 5.2443f, 20.75f, 10.1433f)
                curveTo(20.75f, 12.5084f, 20.076f, 15.0479f, 18.8844f, 17.2419f)
                curveTo(17.6944f, 19.4331f, 15.9556f, 21.3372f, 13.7805f, 22.3539f)
                curveTo(12.6506f, 22.882f, 11.3494f, 22.882f, 10.2195f, 22.3539f)
                curveTo(8.0444f, 21.3372f, 6.3056f, 19.4331f, 5.1156f, 17.2419f)
                curveTo(3.924f, 15.0479f, 3.25f, 12.5084f, 3.25f, 10.1433f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(8.0084f, 2.75f, 4.75f, 6.0475f, 4.75f, 10.1433f)
                curveTo(4.75f, 12.2404f, 5.3526f, 14.5354f, 6.4337f, 16.526f)
                curveTo(7.5162f, 18.5192f, 9.046f, 20.1496f, 10.8546f, 20.995f)
                curveTo(11.5821f, 21.335f, 12.4179f, 21.335f, 13.1454f, 20.995f)
                curveTo(14.954f, 20.1496f, 16.4838f, 18.5192f, 17.5663f, 16.526f)
                curveTo(18.6474f, 14.5354f, 19.25f, 12.2404f, 19.25f, 10.1433f)
                curveTo(19.25f, 6.0475f, 15.9916f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(10.9666f, 5.9318f)
                curveTo(11.6301f, 5.6894f, 12.3698f, 5.6894f, 13.0334f, 5.9318f)
                lineTo(15.3753f, 6.7874f)
                curveTo(15.9163f, 6.985f, 16.25f, 7.4674f, 16.25f, 8.0f)
                curveTo(16.25f, 8.5326f, 15.9163f, 9.015f, 15.3753f, 9.2127f)
                lineTo(15.25f, 9.2584f)
                verticalLineTo(11.7002f)
                curveTo(15.25f, 12.3732f, 14.856f, 13.0287f, 14.1693f, 13.2821f)
                curveTo(13.6442f, 13.4759f, 12.779f, 13.75f, 12.0f, 13.75f)
                curveTo(11.221f, 13.75f, 10.3558f, 13.4759f, 9.8307f, 13.2821f)
                curveTo(9.144f, 13.0287f, 8.75f, 12.3732f, 8.75f, 11.7002f)
                verticalLineTo(9.2584f)
                lineTo(8.6247f, 9.2127f)
                curveTo(8.0837f, 9.015f, 7.75f, 8.5326f, 7.75f, 8.0f)
                curveTo(7.75f, 7.4674f, 8.0837f, 6.985f, 8.6247f, 6.7873f)
                lineTo(10.9666f, 5.9318f)
                close()
                moveTo(10.25f, 9.8064f)
                verticalLineTo(11.7002f)
                curveTo(10.25f, 11.805f, 10.3069f, 11.859f, 10.35f, 11.8749f)
                curveTo(10.8512f, 12.0598f, 11.5041f, 12.25f, 12.0f, 12.25f)
                curveTo(12.4959f, 12.25f, 13.1488f, 12.0598f, 13.65f, 11.8749f)
                curveTo(13.6931f, 11.859f, 13.75f, 11.805f, 13.75f, 11.7002f)
                verticalLineTo(9.8064f)
                lineTo(13.0334f, 10.0682f)
                curveTo(12.3699f, 10.3106f, 11.6302f, 10.3106f, 10.9666f, 10.0682f)
                lineTo(10.25f, 9.8064f)
                close()
                moveTo(12.5187f, 7.3407f)
                curveTo(12.1875f, 7.2198f, 11.8125f, 7.2198f, 11.4813f, 7.3407f)
                lineTo(9.6767f, 8.0f)
                lineTo(11.4813f, 8.6593f)
                curveTo(11.8125f, 8.7802f, 12.1875f, 8.7802f, 12.5187f, 8.6593f)
                lineTo(14.3233f, 8.0f)
                lineTo(12.5187f, 7.3407f)
                close()
            }
        }
            .build()
        return _mapPointSchool!!
    }

private var _mapPointSchool: ImageVector? = null
