package com.chiksmedina.solar.boldduotone.maplocation

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
import com.chiksmedina.solar.boldduotone.MapLocationGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.5371f, 21.6744f)
                curveTo(11.4657f, 22.1085f, 12.5343f, 22.1085f, 13.4629f, 21.6744f)
                curveTo(17.4467f, 19.8124f, 20.0f, 14.6055f, 20.0f, 10.1433f)
                curveTo(20.0f, 5.6459f, 16.4183f, 2.0f, 12.0f, 2.0f)
                curveTo(7.5817f, 2.0f, 4.0f, 5.6459f, 4.0f, 10.1433f)
                curveTo(4.0f, 14.6055f, 6.5533f, 19.8124f, 10.5371f, 21.6744f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.0334f, 5.9318f)
                curveTo(12.3698f, 5.6894f, 11.6301f, 5.6894f, 10.9666f, 5.9318f)
                lineTo(8.6247f, 6.7873f)
                curveTo(8.0837f, 6.985f, 7.75f, 7.4674f, 7.75f, 8.0f)
                curveTo(7.75f, 8.5326f, 8.0837f, 9.015f, 8.6247f, 9.2127f)
                lineTo(8.75f, 9.2584f)
                verticalLineTo(11.7002f)
                curveTo(8.75f, 12.3732f, 9.144f, 13.0287f, 9.8307f, 13.2821f)
                curveTo(10.3558f, 13.4759f, 11.221f, 13.75f, 12.0f, 13.75f)
                curveTo(12.779f, 13.75f, 13.6442f, 13.4759f, 14.1693f, 13.2821f)
                curveTo(14.856f, 13.0287f, 15.25f, 12.3732f, 15.25f, 11.7002f)
                verticalLineTo(9.2584f)
                lineTo(15.3753f, 9.2127f)
                curveTo(15.9163f, 9.015f, 16.25f, 8.5326f, 16.25f, 8.0f)
                curveTo(16.25f, 7.4674f, 15.9163f, 6.985f, 15.3753f, 6.7874f)
                lineTo(13.0334f, 5.9318f)
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
