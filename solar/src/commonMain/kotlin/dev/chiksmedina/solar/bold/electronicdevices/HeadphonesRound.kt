package dev.chiksmedina.solar.bold.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.ElectronicDevicesGroup

val ElectronicDevicesGroup.HeadphonesRound: ImageVector
    get() {
        if (_headphonesRound != null) {
            return _headphonesRound!!
        }
        _headphonesRound = Builder(
            name = "HeadphonesRound", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 12.124f)
                curveTo(2.0f, 6.5327f, 6.4771f, 2.0f, 11.9999f, 2.0f)
                curveTo(17.5228f, 2.0f, 21.9999f, 6.5327f, 21.9999f, 12.124f)
                lineTo(21.9999f, 17.3675f)
                curveTo(22.0002f, 18.1844f, 22.0004f, 18.7446f, 21.8568f, 19.2364f)
                curveTo(21.576f, 20.1982f, 20.9046f, 20.9937f, 20.01f, 21.4245f)
                curveTo(19.5525f, 21.6449f, 19.0059f, 21.732f, 18.2088f, 21.8591f)
                lineTo(18.0789f, 21.8799f)
                curveTo(17.7954f, 21.9252f, 17.5532f, 21.9639f, 17.3522f, 21.9839f)
                curveTo(17.1431f, 22.0047f, 16.9299f, 22.0111f, 16.7118f, 21.9676f)
                curveTo(15.9942f, 21.8245f, 15.4024f, 21.3126f, 15.1508f, 20.6172f)
                curveTo(15.0744f, 20.4059f, 15.0474f, 20.1916f, 15.035f, 19.9793f)
                curveTo(15.0232f, 19.7753f, 15.0232f, 19.527f, 15.0232f, 19.2365f)
                lineTo(15.0231f, 15.0641f)
                curveTo(15.0226f, 14.6386f, 15.0222f, 14.2725f, 15.1195f, 13.959f)
                curveTo(15.3422f, 13.2416f, 15.9238f, 12.6975f, 16.6477f, 12.5292f)
                curveTo(16.9641f, 12.4556f, 17.3246f, 12.4849f, 17.7435f, 12.5189f)
                lineTo(17.8367f, 12.5264f)
                lineTo(17.9465f, 12.5352f)
                curveTo(18.7302f, 12.5975f, 19.2664f, 12.6402f, 19.7216f, 12.8106f)
                curveTo(20.0415f, 12.9304f, 20.3381f, 13.0953f, 20.6046f, 13.2976f)
                verticalLineTo(12.124f)
                curveTo(20.6046f, 7.3129f, 16.7521f, 3.4127f, 11.9999f, 3.4127f)
                curveTo(7.2478f, 3.4127f, 3.3953f, 7.3129f, 3.3953f, 12.124f)
                verticalLineTo(13.2976f)
                curveTo(3.6618f, 13.0953f, 3.9584f, 12.9304f, 4.2783f, 12.8106f)
                curveTo(4.7334f, 12.6402f, 5.2696f, 12.5975f, 6.0533f, 12.5352f)
                lineTo(6.1632f, 12.5264f)
                lineTo(6.2564f, 12.5189f)
                curveTo(6.6753f, 12.4849f, 7.0358f, 12.4556f, 7.3522f, 12.5292f)
                curveTo(8.0761f, 12.6975f, 8.6577f, 13.2416f, 8.8804f, 13.959f)
                curveTo(8.9777f, 14.2725f, 8.9773f, 14.6386f, 8.9768f, 15.0641f)
                lineTo(8.9767f, 19.2365f)
                curveTo(8.9767f, 19.527f, 8.9767f, 19.7753f, 8.9649f, 19.9793f)
                curveTo(8.9525f, 20.1916f, 8.9255f, 20.4059f, 8.8491f, 20.6172f)
                curveTo(8.5975f, 21.3126f, 8.0057f, 21.8245f, 7.2881f, 21.9676f)
                curveTo(7.07f, 22.0111f, 6.8568f, 22.0047f, 6.6477f, 21.9839f)
                curveTo(6.4467f, 21.9639f, 6.2045f, 21.9252f, 5.921f, 21.8799f)
                lineTo(5.7911f, 21.8591f)
                curveTo(4.994f, 21.732f, 4.4474f, 21.6449f, 3.9899f, 21.4245f)
                curveTo(3.0953f, 20.9937f, 2.4239f, 20.1982f, 2.1431f, 19.2364f)
                curveTo(2.0247f, 18.8309f, 2.004f, 18.3788f, 2.0006f, 17.7747f)
                lineTo(2.0f, 17.5803f)
                verticalLineTo(12.124f)
                close()
            }
        }
            .build()
        return _headphonesRound!!
    }

private var _headphonesRound: ImageVector? = null
