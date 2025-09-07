package com.chiksmedina.solar.outline.list

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.ListGroup

val ListGroup.Playlist: ImageVector
    get() {
        if (_playlist != null) {
            return _playlist!!
        }
        _playlist = Builder(
            name = "Playlist", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.25f, 6.0f)
                curveTo(2.25f, 5.5858f, 2.5858f, 5.25f, 3.0f, 5.25f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 5.25f, 21.75f, 5.5858f, 21.75f, 6.0f)
                curveTo(21.75f, 6.4142f, 21.4142f, 6.75f, 21.0f, 6.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 6.75f, 2.25f, 6.4142f, 2.25f, 6.0f)
                close()
                moveTo(2.25f, 10.0f)
                curveTo(2.25f, 9.5858f, 2.5858f, 9.25f, 3.0f, 9.25f)
                horizontalLineTo(21.0f)
                curveTo(21.4142f, 9.25f, 21.75f, 9.5858f, 21.75f, 10.0f)
                curveTo(21.75f, 10.4142f, 21.4142f, 10.75f, 21.0f, 10.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 10.75f, 2.25f, 10.4142f, 2.25f, 10.0f)
                close()
                moveTo(19.2053f, 13.4431f)
                lineTo(19.2948f, 13.4948f)
                curveTo(20.0836f, 13.9501f, 20.7374f, 14.3276f, 21.2037f, 14.681f)
                curveTo(21.6788f, 15.041f, 22.105f, 15.4808f, 22.2158f, 16.1093f)
                curveTo(22.2614f, 16.3678f, 22.2614f, 16.6322f, 22.2158f, 16.8907f)
                curveTo(22.105f, 17.5192f, 21.6788f, 17.959f, 21.2037f, 18.319f)
                curveTo(20.7374f, 18.6724f, 20.0836f, 19.0499f, 19.2947f, 19.5053f)
                lineTo(19.2053f, 19.5569f)
                curveTo(18.4165f, 20.0124f, 17.7626f, 20.3899f, 17.2235f, 20.617f)
                curveTo(16.6741f, 20.8485f, 16.0802f, 20.9977f, 15.4805f, 20.7794f)
                curveTo(15.2338f, 20.6896f, 15.0048f, 20.5574f, 14.8037f, 20.3887f)
                curveTo(14.3148f, 19.9784f, 14.1471f, 19.3894f, 14.0728f, 18.798f)
                curveTo(14.0f, 18.2175f, 14.0f, 17.4625f, 14.0f, 16.5517f)
                verticalLineTo(16.4483f)
                curveTo(14.0f, 15.5375f, 14.0f, 14.7825f, 14.0728f, 14.202f)
                curveTo(14.1471f, 13.6106f, 14.3148f, 13.0216f, 14.8037f, 12.6113f)
                curveTo(15.0048f, 12.4426f, 15.2338f, 12.3104f, 15.4805f, 12.2206f)
                curveTo(16.0802f, 12.0023f, 16.6741f, 12.1515f, 17.2235f, 12.383f)
                curveTo(17.7626f, 12.6101f, 18.4165f, 12.9876f, 19.2053f, 13.4431f)
                close()
                moveTo(16.6411f, 13.7653f)
                curveTo(16.1992f, 13.5791f, 16.051f, 13.6092f, 15.9935f, 13.6302f)
                curveTo(15.9113f, 13.6601f, 15.8349f, 13.7042f, 15.7679f, 13.7604f)
                curveTo(15.721f, 13.7998f, 15.6209f, 13.913f, 15.5611f, 14.3888f)
                curveTo(15.5014f, 14.8646f, 15.5f, 15.5243f, 15.5f, 16.5f)
                curveTo(15.5f, 17.4757f, 15.5014f, 18.1354f, 15.5611f, 18.6112f)
                curveTo(15.6209f, 19.087f, 15.721f, 19.2002f, 15.7679f, 19.2396f)
                curveTo(15.8349f, 19.2958f, 15.9113f, 19.3399f, 15.9935f, 19.3698f)
                curveTo(16.051f, 19.3908f, 16.1992f, 19.4209f, 16.6411f, 19.2347f)
                curveTo(17.083f, 19.0485f, 17.655f, 18.7199f, 18.5f, 18.2321f)
                curveTo(19.345f, 17.7442f, 19.9156f, 17.4131f, 20.2978f, 17.1235f)
                curveTo(20.68f, 16.8339f, 20.728f, 16.6905f, 20.7386f, 16.6302f)
                curveTo(20.7538f, 16.5441f, 20.7538f, 16.4559f, 20.7386f, 16.3698f)
                curveTo(20.728f, 16.3095f, 20.68f, 16.1661f, 20.2978f, 15.8765f)
                curveTo(19.9156f, 15.5869f, 19.345f, 15.2558f, 18.5f, 14.7679f)
                curveTo(17.655f, 14.2801f, 17.083f, 13.9515f, 16.6411f, 13.7653f)
                close()
                moveTo(2.25f, 14.0f)
                curveTo(2.25f, 13.5858f, 2.5858f, 13.25f, 3.0f, 13.25f)
                horizontalLineTo(11.0f)
                curveTo(11.4142f, 13.25f, 11.75f, 13.5858f, 11.75f, 14.0f)
                curveTo(11.75f, 14.4142f, 11.4142f, 14.75f, 11.0f, 14.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 14.75f, 2.25f, 14.4142f, 2.25f, 14.0f)
                close()
                moveTo(2.25f, 18.0f)
                curveTo(2.25f, 17.5858f, 2.5858f, 17.25f, 3.0f, 17.25f)
                horizontalLineTo(11.0f)
                curveTo(11.4142f, 17.25f, 11.75f, 17.5858f, 11.75f, 18.0f)
                curveTo(11.75f, 18.4142f, 11.4142f, 18.75f, 11.0f, 18.75f)
                horizontalLineTo(3.0f)
                curveTo(2.5858f, 18.75f, 2.25f, 18.4142f, 2.25f, 18.0f)
                close()
            }
        }
            .build()
        return _playlist!!
    }

private var _playlist: ImageVector? = null
