package dev.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.MusicNoteSlider: ImageVector
    get() {
        if (_musicNoteSlider != null) {
            return _musicNoteSlider!!
        }
        _musicNoteSlider = Builder(
            name = "MusicNoteSlider", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.9451f, 1.25f)
                horizontalLineTo(13.0549f)
                curveTo(14.4225f, 1.25f, 15.5248f, 1.25f, 16.3918f, 1.3665f)
                curveTo(17.2919f, 1.4875f, 18.0498f, 1.7464f, 18.6517f, 2.3484f)
                curveTo(19.0519f, 2.7485f, 19.3004f, 3.2177f, 19.4577f, 3.7517f)
                curveTo(19.6692f, 3.755f, 19.8458f, 3.7643f, 20.0084f, 3.79f)
                curveTo(21.3991f, 4.0103f, 22.4898f, 5.1009f, 22.71f, 6.4916f)
                curveTo(22.7502f, 6.7455f, 22.7501f, 7.0336f, 22.75f, 7.4353f)
                curveTo(22.75f, 7.4565f, 22.75f, 7.4781f, 22.75f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(22.75f, 16.5219f, 22.75f, 16.5435f, 22.75f, 16.5647f)
                curveTo(22.7501f, 16.9664f, 22.7502f, 17.2545f, 22.71f, 17.5084f)
                curveTo(22.4898f, 18.8991f, 21.3991f, 19.9897f, 20.0084f, 20.21f)
                curveTo(19.8458f, 20.2357f, 19.6692f, 20.245f, 19.4577f, 20.2482f)
                curveTo(19.3004f, 20.7823f, 19.0519f, 21.2514f, 18.6517f, 21.6517f)
                curveTo(18.0498f, 22.2536f, 17.2919f, 22.5125f, 16.3918f, 22.6335f)
                curveTo(15.5248f, 22.75f, 14.4225f, 22.75f, 13.0549f, 22.75f)
                horizontalLineTo(10.9452f)
                curveTo(9.5776f, 22.75f, 8.4752f, 22.75f, 7.6083f, 22.6335f)
                curveTo(6.7082f, 22.5125f, 5.9503f, 22.2536f, 5.3484f, 21.6517f)
                curveTo(4.9482f, 21.2514f, 4.6996f, 20.7823f, 4.5424f, 20.2482f)
                curveTo(4.3309f, 20.245f, 4.1542f, 20.2357f, 3.9916f, 20.21f)
                curveTo(2.601f, 19.9897f, 1.5103f, 18.8991f, 1.29f, 17.5084f)
                curveTo(1.2498f, 17.2545f, 1.2499f, 16.9664f, 1.25f, 16.5647f)
                curveTo(1.25f, 16.5435f, 1.25f, 16.5219f, 1.25f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(1.25f, 7.4781f, 1.25f, 7.4565f, 1.25f, 7.4353f)
                curveTo(1.2499f, 7.0336f, 1.2498f, 6.7455f, 1.29f, 6.4916f)
                curveTo(1.5103f, 5.1009f, 2.601f, 4.0103f, 3.9916f, 3.79f)
                curveTo(4.1542f, 3.7643f, 4.3309f, 3.755f, 4.5424f, 3.7517f)
                curveTo(4.6996f, 3.2177f, 4.9482f, 2.7485f, 5.3484f, 2.3484f)
                curveTo(5.9503f, 1.7464f, 6.7082f, 1.4875f, 7.6083f, 1.3665f)
                curveTo(8.4752f, 1.25f, 9.5776f, 1.25f, 10.9451f, 1.25f)
                close()
                moveTo(4.3019f, 5.2623f)
                curveTo(4.274f, 5.2648f, 4.2494f, 5.2679f, 4.2263f, 5.2716f)
                curveTo(3.4774f, 5.3902f, 2.8902f, 5.9774f, 2.7716f, 6.7262f)
                curveTo(2.7524f, 6.8476f, 2.75f, 7.0068f, 2.75f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(2.75f, 16.9932f, 2.7524f, 17.1524f, 2.7716f, 17.2738f)
                curveTo(2.8902f, 18.0226f, 3.4774f, 18.6099f, 4.2263f, 18.7285f)
                curveTo(4.2494f, 18.7321f, 4.274f, 18.7352f, 4.3019f, 18.7377f)
                curveTo(4.25f, 17.9893f, 4.25f, 17.0995f, 4.25f, 16.0549f)
                verticalLineTo(7.9451f)
                curveTo(4.25f, 6.9005f, 4.25f, 6.0107f, 4.3019f, 5.2623f)
                close()
                moveTo(19.6981f, 18.7377f)
                curveTo(19.7261f, 18.7352f, 19.7506f, 18.7321f, 19.7738f, 18.7285f)
                curveTo(20.5226f, 18.6099f, 21.1099f, 18.0226f, 21.2285f, 17.2738f)
                curveTo(21.2477f, 17.1524f, 21.25f, 16.9932f, 21.25f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(21.25f, 7.0068f, 21.2477f, 6.8476f, 21.2285f, 6.7262f)
                curveTo(21.1099f, 5.9774f, 20.5226f, 5.3902f, 19.7738f, 5.2716f)
                curveTo(19.7506f, 5.2679f, 19.7261f, 5.2648f, 19.6981f, 5.2623f)
                curveTo(19.7501f, 6.0107f, 19.75f, 6.9005f, 19.75f, 7.9451f)
                verticalLineTo(16.0549f)
                curveTo(19.75f, 17.0995f, 19.7501f, 17.9893f, 19.6981f, 18.7377f)
                close()
                moveTo(7.8081f, 2.8531f)
                curveTo(7.0744f, 2.9518f, 6.6858f, 3.1323f, 6.409f, 3.409f)
                curveTo(6.1323f, 3.6858f, 5.9518f, 4.0743f, 5.8532f, 4.8081f)
                curveTo(5.7516f, 5.5635f, 5.75f, 6.5646f, 5.75f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(5.75f, 17.4354f, 5.7516f, 18.4365f, 5.8532f, 19.1919f)
                curveTo(5.9518f, 19.9257f, 6.1323f, 20.3142f, 6.409f, 20.591f)
                curveTo(6.6858f, 20.8678f, 7.0744f, 21.0482f, 7.8081f, 21.1469f)
                curveTo(8.5635f, 21.2484f, 9.5646f, 21.25f, 11.0f, 21.25f)
                horizontalLineTo(13.0f)
                curveTo(14.4354f, 21.25f, 15.4366f, 21.2484f, 16.1919f, 21.1469f)
                curveTo(16.9257f, 21.0482f, 17.3142f, 20.8678f, 17.591f, 20.591f)
                curveTo(17.8678f, 20.3142f, 18.0482f, 19.9257f, 18.1469f, 19.1919f)
                curveTo(18.2484f, 18.4365f, 18.25f, 17.4354f, 18.25f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(18.25f, 6.5646f, 18.2484f, 5.5635f, 18.1469f, 4.8081f)
                curveTo(18.0482f, 4.0743f, 17.8678f, 3.6858f, 17.591f, 3.409f)
                curveTo(17.3142f, 3.1323f, 16.9257f, 2.9518f, 16.1919f, 2.8531f)
                curveTo(15.4366f, 2.7516f, 14.4354f, 2.75f, 13.0f, 2.75f)
                horizontalLineTo(11.0f)
                curveTo(9.5646f, 2.75f, 8.5635f, 2.7516f, 7.8081f, 2.8531f)
                close()
                moveTo(13.75f, 10.4501f)
                verticalLineTo(14.0f)
                curveTo(13.75f, 15.5188f, 12.5188f, 16.75f, 11.0f, 16.75f)
                curveTo(9.4812f, 16.75f, 8.25f, 15.5188f, 8.25f, 14.0f)
                curveTo(8.25f, 12.4812f, 9.4812f, 11.25f, 11.0f, 11.25f)
                curveTo(11.4501f, 11.25f, 11.875f, 11.3581f, 12.25f, 11.5499f)
                verticalLineTo(8.75f)
                curveTo(12.25f, 8.3358f, 12.5858f, 8.0f, 13.0f, 8.0f)
                curveTo(13.4142f, 8.0f, 13.7341f, 8.3642f, 13.9682f, 8.7058f)
                curveTo(14.1934f, 9.0344f, 14.5716f, 9.25f, 15.0f, 9.25f)
                curveTo(15.4142f, 9.25f, 15.75f, 9.5858f, 15.75f, 10.0f)
                curveTo(15.75f, 10.4142f, 15.4142f, 10.75f, 15.0f, 10.75f)
                curveTo(14.5499f, 10.75f, 14.1251f, 10.6419f, 13.75f, 10.4501f)
                close()
                moveTo(11.0f, 12.75f)
                curveTo(10.3097f, 12.75f, 9.75f, 13.3096f, 9.75f, 14.0f)
                curveTo(9.75f, 14.6904f, 10.3097f, 15.25f, 11.0f, 15.25f)
                curveTo(11.6904f, 15.25f, 12.25f, 14.6904f, 12.25f, 14.0f)
                curveTo(12.25f, 13.3096f, 11.6904f, 12.75f, 11.0f, 12.75f)
                close()
            }
        }
            .build()
        return _musicNoteSlider!!
    }

private var _musicNoteSlider: ImageVector? = null
