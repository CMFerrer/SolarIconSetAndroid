package com.chiksmedina.solar.outline.electronicdevices

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.AirbudsCaseOpen: ImageVector
    get() {
        if (_airbudsCaseOpen != null) {
            return _airbudsCaseOpen!!
        }
        _airbudsCaseOpen = Builder(
            name = "AirbudsCaseOpen", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(6.125f, 2.75f)
                curveTo(5.0895f, 2.75f, 4.25f, 3.5895f, 4.25f, 4.625f)
                verticalLineTo(5.9414f)
                curveTo(4.25f, 6.8917f, 5.0203f, 7.662f, 5.9706f, 7.662f)
                curveTo(6.8396f, 7.662f, 7.5441f, 8.3665f, 7.5441f, 9.2355f)
                verticalLineTo(10.25f)
                horizontalLineTo(9.75f)
                verticalLineTo(6.375f)
                curveTo(9.75f, 4.373f, 8.127f, 2.75f, 6.125f, 2.75f)
                close()
                moveTo(11.25f, 10.25f)
                verticalLineTo(6.375f)
                curveTo(11.25f, 3.5445f, 8.9555f, 1.25f, 6.125f, 1.25f)
                curveTo(4.261f, 1.25f, 2.75f, 2.761f, 2.75f, 4.625f)
                verticalLineTo(5.9414f)
                curveTo(2.75f, 7.7201f, 4.1919f, 9.162f, 5.9706f, 9.162f)
                curveTo(6.0112f, 9.162f, 6.0441f, 9.1949f, 6.0441f, 9.2355f)
                verticalLineTo(10.25f)
                lineTo(4.7965f, 10.25f)
                curveTo(4.4373f, 10.25f, 4.1077f, 10.2499f, 3.8361f, 10.2806f)
                curveTo(3.5401f, 10.3139f, 3.2216f, 10.3914f, 2.9347f, 10.6116f)
                curveTo(2.8133f, 10.7047f, 2.7047f, 10.8133f, 2.6116f, 10.9347f)
                curveTo(2.3914f, 11.2216f, 2.3139f, 11.54f, 2.2806f, 11.8361f)
                curveTo(2.2499f, 12.1077f, 2.25f, 12.4373f, 2.25f, 12.7965f)
                lineTo(2.25f, 13.0452f)
                curveTo(2.25f, 14.8818f, 2.25f, 16.3214f, 2.3737f, 17.4635f)
                curveTo(2.5f, 18.6291f, 2.7623f, 19.5734f, 3.3482f, 20.3798f)
                curveTo(3.7028f, 20.8679f, 4.1321f, 21.2972f, 4.6202f, 21.6518f)
                curveTo(5.4266f, 22.2377f, 6.3709f, 22.5f, 7.5365f, 22.6263f)
                curveTo(8.6786f, 22.75f, 10.1182f, 22.75f, 11.9547f, 22.75f)
                horizontalLineTo(12.0453f)
                curveTo(13.8818f, 22.75f, 15.3214f, 22.75f, 16.4635f, 22.6263f)
                curveTo(17.6291f, 22.5f, 18.5734f, 22.2377f, 19.3798f, 21.6518f)
                curveTo(19.8679f, 21.2972f, 20.2972f, 20.8679f, 20.6519f, 20.3798f)
                curveTo(21.2377f, 19.5734f, 21.5f, 18.6291f, 21.6263f, 17.4635f)
                curveTo(21.75f, 16.3214f, 21.75f, 14.8818f, 21.75f, 13.0453f)
                lineTo(21.75f, 12.7964f)
                curveTo(21.75f, 12.4373f, 21.7501f, 12.1077f, 21.7195f, 11.8361f)
                curveTo(21.6861f, 11.54f, 21.6086f, 11.2216f, 21.3884f, 10.9347f)
                curveTo(21.2953f, 10.8133f, 21.1867f, 10.7047f, 21.0653f, 10.6116f)
                curveTo(20.7784f, 10.3914f, 20.46f, 10.3139f, 20.1639f, 10.2806f)
                curveTo(19.8923f, 10.2499f, 19.5627f, 10.25f, 19.2036f, 10.25f)
                lineTo(17.9559f, 10.25f)
                verticalLineTo(9.2355f)
                curveTo(17.9559f, 9.1949f, 17.9888f, 9.162f, 18.0294f, 9.162f)
                curveTo(19.8081f, 9.162f, 21.25f, 7.7201f, 21.25f, 5.9414f)
                verticalLineTo(4.625f)
                curveTo(21.25f, 2.761f, 19.739f, 1.25f, 17.875f, 1.25f)
                curveTo(15.0445f, 1.25f, 12.75f, 3.5445f, 12.75f, 6.375f)
                verticalLineTo(10.25f)
                horizontalLineTo(11.25f)
                close()
                moveTo(8.9999f, 11.75f)
                curveTo(9.228f, 12.0536f, 9.5911f, 12.25f, 10.0f, 12.25f)
                horizontalLineTo(14.0f)
                curveTo(14.409f, 12.25f, 14.772f, 12.0536f, 15.0001f, 11.75f)
                horizontalLineTo(8.9999f)
                close()
                moveTo(16.6465f, 11.75f)
                curveTo(16.32f, 12.9043f, 15.2588f, 13.75f, 14.0f, 13.75f)
                horizontalLineTo(10.0f)
                curveTo(8.7412f, 13.75f, 7.68f, 12.9043f, 7.3535f, 11.75f)
                horizontalLineTo(4.8333f)
                curveTo(4.425f, 11.75f, 4.1815f, 11.7511f, 4.0041f, 11.7711f)
                curveTo(3.9006f, 11.7828f, 3.8583f, 11.7975f, 3.8459f, 11.8031f)
                curveTo(3.83f, 11.8156f, 3.8156f, 11.83f, 3.8031f, 11.8459f)
                curveTo(3.7975f, 11.8583f, 3.7828f, 11.9006f, 3.7711f, 12.0041f)
                curveTo(3.7511f, 12.1815f, 3.75f, 12.425f, 3.75f, 12.8333f)
                verticalLineTo(13.0f)
                curveTo(3.75f, 14.8916f, 3.751f, 16.25f, 3.865f, 17.302f)
                curveTo(3.9775f, 18.3399f, 4.1926f, 18.9901f, 4.5617f, 19.4981f)
                curveTo(4.8238f, 19.8589f, 5.1411f, 20.1762f, 5.5019f, 20.4383f)
                curveTo(6.0099f, 20.8074f, 6.6601f, 21.0225f, 7.6981f, 21.135f)
                curveTo(8.75f, 21.249f, 10.1084f, 21.25f, 12.0f, 21.25f)
                curveTo(13.8916f, 21.25f, 15.25f, 21.249f, 16.302f, 21.135f)
                curveTo(17.3399f, 21.0225f, 17.9901f, 20.8074f, 18.4981f, 20.4383f)
                curveTo(18.8589f, 20.1762f, 19.1762f, 19.8589f, 19.4383f, 19.4981f)
                curveTo(19.8074f, 18.9901f, 20.0226f, 18.3399f, 20.135f, 17.302f)
                curveTo(20.249f, 16.25f, 20.25f, 14.8916f, 20.25f, 13.0f)
                verticalLineTo(12.8333f)
                curveTo(20.25f, 12.425f, 20.2489f, 12.1815f, 20.2289f, 12.0041f)
                curveTo(20.2172f, 11.9005f, 20.2025f, 11.8583f, 20.1969f, 11.8459f)
                curveTo(20.1844f, 11.83f, 20.17f, 11.8156f, 20.1541f, 11.8031f)
                curveTo(20.1417f, 11.7975f, 20.0995f, 11.7828f, 19.9959f, 11.7711f)
                curveTo(19.8186f, 11.7511f, 19.575f, 11.75f, 19.1667f, 11.75f)
                horizontalLineTo(16.6465f)
                close()
                moveTo(16.4559f, 10.25f)
                horizontalLineTo(14.25f)
                verticalLineTo(6.375f)
                curveTo(14.25f, 4.373f, 15.873f, 2.75f, 17.875f, 2.75f)
                curveTo(18.9105f, 2.75f, 19.75f, 3.5895f, 19.75f, 4.625f)
                verticalLineTo(5.9414f)
                curveTo(19.75f, 6.8917f, 18.9797f, 7.662f, 18.0294f, 7.662f)
                curveTo(17.1604f, 7.662f, 16.4559f, 8.3665f, 16.4559f, 9.2355f)
                verticalLineTo(10.25f)
                close()
            }
        }
            .build()
        return _airbudsCaseOpen!!
    }

private var _airbudsCaseOpen: ImageVector? = null
