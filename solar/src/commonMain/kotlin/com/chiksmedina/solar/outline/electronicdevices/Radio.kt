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

val ElectronicDevicesGroup.Radio: ImageVector
    get() {
        if (_radio != null) {
            return _radio!!
        }
        _radio = Builder(
            name = "Radio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.6786f, 1.6808f)
                curveTo(15.855f, 2.0556f, 15.6941f, 2.5024f, 15.3193f, 2.6788f)
                lineTo(9.8552f, 5.2502f)
                curveTo(9.8845f, 5.2502f, 9.914f, 5.2502f, 9.9436f, 5.2502f)
                horizontalLineTo(14.0564f)
                curveTo(15.8942f, 5.2502f, 17.3498f, 5.2502f, 18.489f, 5.4033f)
                curveTo(19.6614f, 5.5609f, 20.6104f, 5.8931f, 21.3588f, 6.6414f)
                curveTo(22.1071f, 7.3898f, 22.4392f, 8.3387f, 22.5969f, 9.5112f)
                curveTo(22.75f, 10.6504f, 22.75f, 12.106f, 22.75f, 13.9438f)
                verticalLineTo(14.0566f)
                curveTo(22.75f, 15.8944f, 22.75f, 17.35f, 22.5969f, 18.4892f)
                curveTo(22.4392f, 19.6616f, 22.1071f, 20.6106f, 21.3588f, 21.3589f)
                curveTo(20.6104f, 22.1073f, 19.6614f, 22.4394f, 18.489f, 22.597f)
                curveTo(17.3498f, 22.7502f, 15.8942f, 22.7502f, 14.0564f, 22.7502f)
                horizontalLineTo(9.9436f)
                curveTo(8.1058f, 22.7502f, 6.6502f, 22.7502f, 5.511f, 22.597f)
                curveTo(4.3386f, 22.4394f, 3.3896f, 22.1073f, 2.6412f, 21.3589f)
                curveTo(1.8929f, 20.6106f, 1.5608f, 19.6616f, 1.4031f, 18.4892f)
                curveTo(1.25f, 17.35f, 1.25f, 15.8944f, 1.25f, 14.0566f)
                verticalLineTo(13.9438f)
                curveTo(1.25f, 12.106f, 1.25f, 10.6504f, 1.4031f, 9.5112f)
                curveTo(1.5608f, 8.3387f, 1.8929f, 7.3898f, 2.6412f, 6.6414f)
                curveTo(3.3896f, 5.8931f, 4.3386f, 5.5609f, 5.511f, 5.4033f)
                curveTo(5.715f, 5.3759f, 5.9291f, 5.3534f, 6.1537f, 5.3349f)
                curveTo(6.1626f, 5.3303f, 6.1715f, 5.3259f, 6.1807f, 5.3216f)
                lineTo(14.6807f, 1.3216f)
                curveTo(15.0554f, 1.1452f, 15.5022f, 1.306f, 15.6786f, 1.6808f)
                close()
                moveTo(5.7108f, 6.8899f)
                curveTo(4.7048f, 7.0252f, 4.1251f, 7.2789f, 3.7019f, 7.7021f)
                curveTo(3.2787f, 8.1253f, 3.025f, 8.7049f, 2.8898f, 9.711f)
                curveTo(2.7516f, 10.7387f, 2.75f, 12.0934f, 2.75f, 14.0002f)
                curveTo(2.75f, 15.907f, 2.7516f, 17.2617f, 2.8898f, 18.2893f)
                curveTo(3.025f, 19.2954f, 3.2787f, 19.8751f, 3.7019f, 20.2983f)
                curveTo(4.1251f, 20.7215f, 4.7048f, 20.9752f, 5.7108f, 21.1104f)
                curveTo(6.7385f, 21.2486f, 8.0932f, 21.2502f, 10.0f, 21.2502f)
                horizontalLineTo(14.0f)
                curveTo(15.9068f, 21.2502f, 17.2615f, 21.2486f, 18.2892f, 21.1104f)
                curveTo(19.2952f, 20.9752f, 19.8749f, 20.7215f, 20.2981f, 20.2983f)
                curveTo(20.7213f, 19.8751f, 20.975f, 19.2954f, 21.1102f, 18.2893f)
                curveTo(21.2484f, 17.2617f, 21.25f, 15.907f, 21.25f, 14.0002f)
                curveTo(21.25f, 12.0934f, 21.2484f, 10.7387f, 21.1102f, 9.711f)
                curveTo(20.975f, 8.7049f, 20.7213f, 8.1253f, 20.2981f, 7.7021f)
                curveTo(19.8749f, 7.2789f, 19.2952f, 7.0252f, 18.2892f, 6.8899f)
                curveTo(17.2615f, 6.7518f, 15.9068f, 6.7502f, 14.0f, 6.7502f)
                horizontalLineTo(10.0f)
                curveTo(8.0932f, 6.7502f, 6.7385f, 6.7518f, 5.7108f, 6.8899f)
                close()
                moveTo(4.25f, 11.0002f)
                curveTo(4.25f, 9.4814f, 5.4812f, 8.2502f, 7.0f, 8.2502f)
                horizontalLineTo(17.0f)
                curveTo(18.5188f, 8.2502f, 19.75f, 9.4814f, 19.75f, 11.0002f)
                curveTo(19.75f, 12.519f, 18.5188f, 13.7502f, 17.0f, 13.7502f)
                horizontalLineTo(7.0f)
                curveTo(5.4812f, 13.7502f, 4.25f, 12.519f, 4.25f, 11.0002f)
                close()
                moveTo(15.75f, 12.2502f)
                verticalLineTo(11.5002f)
                curveTo(15.75f, 11.086f, 15.4142f, 10.7502f, 15.0f, 10.7502f)
                curveTo(14.5858f, 10.7502f, 14.25f, 11.086f, 14.25f, 11.5002f)
                verticalLineTo(12.2502f)
                horizontalLineTo(7.0f)
                curveTo(6.3096f, 12.2502f, 5.75f, 11.6905f, 5.75f, 11.0002f)
                curveTo(5.75f, 10.3098f, 6.3096f, 9.7502f, 7.0f, 9.7502f)
                horizontalLineTo(17.0f)
                curveTo(17.6904f, 9.7502f, 18.25f, 10.3098f, 18.25f, 11.0002f)
                curveTo(18.25f, 11.6905f, 17.6904f, 12.2502f, 17.0f, 12.2502f)
                horizontalLineTo(15.75f)
                close()
                moveTo(7.5f, 16.2502f)
                curveTo(7.0858f, 16.2502f, 6.75f, 16.586f, 6.75f, 17.0002f)
                curveTo(6.75f, 17.4144f, 7.0858f, 17.7502f, 7.5f, 17.7502f)
                curveTo(7.9142f, 17.7502f, 8.25f, 17.4144f, 8.25f, 17.0002f)
                curveTo(8.25f, 16.586f, 7.9142f, 16.2502f, 7.5f, 16.2502f)
                close()
                moveTo(5.25f, 17.0002f)
                curveTo(5.25f, 15.7575f, 6.2574f, 14.7502f, 7.5f, 14.7502f)
                curveTo(8.7426f, 14.7502f, 9.75f, 15.7575f, 9.75f, 17.0002f)
                curveTo(9.75f, 18.2428f, 8.7426f, 19.2502f, 7.5f, 19.2502f)
                curveTo(6.2574f, 19.2502f, 5.25f, 18.2428f, 5.25f, 17.0002f)
                close()
                moveTo(12.25f, 17.0002f)
                curveTo(12.25f, 16.586f, 12.5858f, 16.2502f, 13.0f, 16.2502f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 16.2502f, 18.75f, 16.586f, 18.75f, 17.0002f)
                curveTo(18.75f, 17.4144f, 18.4142f, 17.7502f, 18.0f, 17.7502f)
                horizontalLineTo(13.0f)
                curveTo(12.5858f, 17.7502f, 12.25f, 17.4144f, 12.25f, 17.0002f)
                close()
            }
        }
            .build()
        return _radio!!
    }

private var _radio: ImageVector? = null
