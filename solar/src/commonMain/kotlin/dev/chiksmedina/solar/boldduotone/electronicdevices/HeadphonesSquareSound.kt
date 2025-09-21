package dev.chiksmedina.solar.boldduotone.electronicdevices

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
import dev.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.HeadphonesSquareSound: ImageVector
    get() {
        if (_headphonesSquareSound != null) {
            return _headphonesSquareSound!!
        }
        _headphonesSquareSound = Builder(
            name = "HeadphonesSquareSound", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0534f, 2.0f)
                curveTo(14.2007f, 2.0f, 15.8835f, 2.0f, 17.1965f, 2.1787f)
                curveTo(18.5405f, 2.3616f, 19.6009f, 2.7434f, 20.4333f, 3.5861f)
                curveTo(21.2657f, 4.4288f, 21.6428f, 5.5024f, 21.8234f, 6.863f)
                curveTo(22.0f, 8.1923f, 22.0f, 9.896f, 21.9999f, 12.07f)
                lineTo(22.0f, 17.3675f)
                curveTo(22.0003f, 18.1844f, 22.0005f, 18.7446f, 21.8569f, 19.2364f)
                curveTo(21.5761f, 20.1982f, 20.9046f, 20.9937f, 20.01f, 21.4245f)
                curveTo(19.5526f, 21.6449f, 19.006f, 21.732f, 18.2089f, 21.8591f)
                lineTo(18.0789f, 21.8799f)
                curveTo(17.7955f, 21.9252f, 17.5532f, 21.9639f, 17.3523f, 21.9839f)
                curveTo(17.1432f, 22.0047f, 16.9299f, 22.0111f, 16.7118f, 21.9676f)
                curveTo(15.9942f, 21.8245f, 15.4024f, 21.3126f, 15.1509f, 20.6172f)
                curveTo(15.0744f, 20.4059f, 15.0474f, 20.1916f, 15.0351f, 19.9793f)
                curveTo(15.0232f, 19.7753f, 15.0232f, 19.527f, 15.0232f, 19.2365f)
                lineTo(15.0232f, 15.0641f)
                curveTo(15.0226f, 14.6386f, 15.0222f, 14.2725f, 15.1196f, 13.959f)
                curveTo(15.3423f, 13.2416f, 15.9238f, 12.6975f, 16.6477f, 12.5292f)
                curveTo(16.9641f, 12.4556f, 17.3246f, 12.4849f, 17.7435f, 12.5189f)
                lineTo(17.8368f, 12.5264f)
                lineTo(17.9466f, 12.5352f)
                curveTo(18.7303f, 12.5975f, 19.2665f, 12.6402f, 19.7217f, 12.8106f)
                curveTo(20.0415f, 12.9304f, 20.3382f, 13.0953f, 20.6046f, 13.2976f)
                verticalLineTo(12.124f)
                curveTo(20.6046f, 9.8843f, 20.6031f, 8.2755f, 20.4405f, 7.0513f)
                curveTo(20.2807f, 5.8473f, 19.9766f, 5.1215f, 19.4467f, 4.585f)
                curveTo(18.9167f, 4.0485f, 18.1998f, 3.7406f, 17.0106f, 3.5788f)
                curveTo(15.8013f, 3.4142f, 14.2123f, 3.4127f, 12.0f, 3.4127f)
                curveTo(9.7877f, 3.4127f, 8.1987f, 3.4142f, 6.9894f, 3.5788f)
                curveTo(5.8002f, 3.7406f, 5.0833f, 4.0485f, 4.5533f, 4.585f)
                curveTo(4.0234f, 5.1215f, 3.7193f, 5.8473f, 3.5595f, 7.0513f)
                curveTo(3.3969f, 8.2755f, 3.3954f, 9.8843f, 3.3954f, 12.124f)
                verticalLineTo(13.2976f)
                curveTo(3.6618f, 13.0953f, 3.9585f, 12.9304f, 4.2783f, 12.8106f)
                curveTo(4.7335f, 12.6402f, 5.2697f, 12.5975f, 6.0534f, 12.5352f)
                lineTo(6.1632f, 12.5264f)
                lineTo(6.2565f, 12.5189f)
                curveTo(6.6754f, 12.4849f, 7.0359f, 12.4556f, 7.3523f, 12.5292f)
                curveTo(8.0762f, 12.6975f, 8.6577f, 13.2416f, 8.8804f, 13.959f)
                curveTo(8.9778f, 14.2725f, 8.9774f, 14.6386f, 8.9768f, 15.0641f)
                lineTo(8.9768f, 19.2365f)
                curveTo(8.9768f, 19.527f, 8.9768f, 19.7753f, 8.9649f, 19.9793f)
                curveTo(8.9526f, 20.1916f, 8.9256f, 20.4059f, 8.8491f, 20.6172f)
                curveTo(8.5976f, 21.3126f, 8.0058f, 21.8245f, 7.2882f, 21.9676f)
                curveTo(7.0701f, 22.0111f, 6.8568f, 22.0047f, 6.6477f, 21.9839f)
                curveTo(6.4468f, 21.9639f, 6.2045f, 21.9252f, 5.9211f, 21.8799f)
                lineTo(5.7911f, 21.8591f)
                curveTo(4.994f, 21.732f, 4.4474f, 21.6449f, 3.99f, 21.4245f)
                curveTo(3.0954f, 20.9937f, 2.4239f, 20.1982f, 2.1431f, 19.2364f)
                curveTo(1.9995f, 18.7446f, 1.9997f, 18.1844f, 2.0f, 17.3675f)
                lineTo(2.0001f, 12.07f)
                curveTo(2.0f, 9.896f, 2.0f, 8.1923f, 2.1766f, 6.863f)
                curveTo(2.3572f, 5.5024f, 2.7343f, 4.4288f, 3.5667f, 3.5861f)
                curveTo(4.3991f, 2.7434f, 5.4595f, 2.3616f, 6.8035f, 2.1787f)
                curveTo(8.1165f, 2.0f, 9.7993f, 2.0f, 11.9466f, 2.0f)
                horizontalLineTo(12.0534f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 5.75f)
                curveTo(12.4142f, 5.75f, 12.75f, 6.0858f, 12.75f, 6.5f)
                verticalLineTo(11.5f)
                curveTo(12.75f, 11.9142f, 12.4142f, 12.25f, 12.0f, 12.25f)
                curveTo(11.5858f, 12.25f, 11.25f, 11.9142f, 11.25f, 11.5f)
                verticalLineTo(6.5f)
                curveTo(11.25f, 6.0858f, 11.5858f, 5.75f, 12.0f, 5.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(15.0f, 7.25f)
                curveTo(15.4142f, 7.25f, 15.75f, 7.5858f, 15.75f, 8.0f)
                lineTo(15.75f, 10.0f)
                curveTo(15.75f, 10.4142f, 15.4142f, 10.75f, 15.0f, 10.75f)
                curveTo(14.5858f, 10.75f, 14.25f, 10.4142f, 14.25f, 10.0f)
                lineTo(14.25f, 8.0f)
                curveTo(14.25f, 7.5858f, 14.5858f, 7.25f, 15.0f, 7.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(9.0f, 7.25f)
                curveTo(9.4142f, 7.25f, 9.75f, 7.5858f, 9.75f, 8.0f)
                verticalLineTo(10.0f)
                curveTo(9.75f, 10.4142f, 9.4142f, 10.75f, 9.0f, 10.75f)
                curveTo(8.5858f, 10.75f, 8.25f, 10.4142f, 8.25f, 10.0f)
                verticalLineTo(8.0f)
                curveTo(8.25f, 7.5858f, 8.5858f, 7.25f, 9.0f, 7.25f)
                close()
            }
        }
            .build()
        return _headphonesSquareSound!!
    }

private var _headphonesSquareSound: ImageVector? = null
