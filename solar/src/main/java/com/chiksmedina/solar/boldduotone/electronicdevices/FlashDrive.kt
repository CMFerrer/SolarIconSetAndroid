package com.chiksmedina.solar.boldduotone.electronicdevices

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
import com.chiksmedina.solar.boldduotone.ElectronicDevicesGroup

val ElectronicDevicesGroup.FlashDrive: ImageVector
    get() {
        if (_flashDrive != null) {
            return _flashDrive!!
        }
        _flashDrive = Builder(
            name = "FlashDrive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.8302f, 10.441f)
                lineTo(18.2959f, 12.0f)
                lineTo(18.1853f, 12.1106f)
                lineTo(18.0968f, 12.022f)
                curveTo(17.6071f, 11.1519f, 16.6506f, 10.1954f, 15.2274f, 8.7723f)
                curveTo(13.8197f, 7.3646f, 12.8687f, 6.4135f, 12.0061f, 5.9191f)
                lineTo(13.6931f, 4.2048f)
                curveTo(15.1397f, 2.7349f, 15.8629f, 2.0f, 16.7617f, 2.0f)
                curveTo(17.6604f, 2.0f, 18.3837f, 2.7349f, 19.8302f, 4.2048f)
                curveTo(21.2767f, 5.6747f, 22.0f, 6.4096f, 22.0f, 7.3229f)
                curveTo(22.0f, 8.2361f, 21.2767f, 8.9711f, 19.8302f, 10.441f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 14.1422f)
                curveTo(2.0f, 15.4903f, 3.0849f, 16.5752f, 5.2547f, 18.745f)
                curveTo(7.4245f, 20.9148f, 8.5093f, 21.9997f, 9.8575f, 21.9997f)
                curveTo(11.2056f, 21.9997f, 12.2905f, 20.9148f, 14.4603f, 18.745f)
                lineTo(15.2274f, 17.9779f)
                curveTo(17.3972f, 15.8081f, 18.4821f, 14.7232f, 18.4821f, 13.3751f)
                curveTo(18.4821f, 12.0269f, 17.3972f, 10.942f, 15.2274f, 8.7723f)
                curveTo(13.0576f, 6.6025f, 11.9727f, 5.5176f, 10.6246f, 5.5176f)
                curveTo(9.2765f, 5.5176f, 8.1916f, 6.6025f, 6.0218f, 8.7723f)
                lineTo(5.2547f, 9.5394f)
                curveTo(3.0849f, 11.7092f, 2.0f, 12.7941f, 2.0f, 14.1422f)
                close()
                moveTo(5.7852f, 13.6122f)
                curveTo(5.4923f, 13.3194f, 5.0174f, 13.3194f, 4.7245f, 13.6122f)
                curveTo(4.4317f, 13.9051f, 4.4317f, 14.38f, 4.7245f, 14.6729f)
                lineTo(9.3274f, 19.2757f)
                curveTo(9.6202f, 19.5686f, 10.0951f, 19.5686f, 10.388f, 19.2757f)
                curveTo(10.6809f, 18.9828f, 10.6809f, 18.5079f, 10.388f, 18.2151f)
                lineTo(5.7852f, 13.6122f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.2476f, 6.8731f)
                curveTo(19.5405f, 7.166f, 19.5405f, 7.6409f, 19.2476f, 7.9338f)
                lineTo(18.5405f, 8.6409f)
                curveTo(18.2476f, 8.9338f, 17.7727f, 8.9338f, 17.4798f, 8.6409f)
                curveTo(17.187f, 8.348f, 17.187f, 7.8731f, 17.4798f, 7.5802f)
                lineTo(18.187f, 6.8731f)
                curveTo(18.4798f, 6.5802f, 18.9547f, 6.5802f, 19.2476f, 6.8731f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(17.1265f, 4.752f)
                curveTo(17.4194f, 5.0449f, 17.4194f, 5.5198f, 17.1265f, 5.8127f)
                lineTo(16.4194f, 6.5198f)
                curveTo(16.1265f, 6.8127f, 15.6516f, 6.8127f, 15.3588f, 6.5198f)
                curveTo(15.0659f, 6.2269f, 15.0659f, 5.752f, 15.3588f, 5.4591f)
                lineTo(16.0659f, 4.752f)
                curveTo(16.3588f, 4.4591f, 16.8336f, 4.4591f, 17.1265f, 4.752f)
                close()
            }
        }
            .build()
        return _flashDrive!!
    }

private var _flashDrive: ImageVector? = null
