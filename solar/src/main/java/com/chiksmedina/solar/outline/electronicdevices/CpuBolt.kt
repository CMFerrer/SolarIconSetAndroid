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

val ElectronicDevicesGroup.CpuBolt: ImageVector
    get() {
        if (_cpuBolt != null) {
            return _cpuBolt!!
        }
        _cpuBolt = Builder(
            name = "CpuBolt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.0f, 1.25f)
                curveTo(9.4142f, 1.25f, 9.75f, 1.5858f, 9.75f, 2.0f)
                verticalLineTo(3.2627f)
                curveTo(10.216f, 3.2538f, 10.7154f, 3.2511f, 11.25f, 3.2503f)
                verticalLineTo(2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                verticalLineTo(3.2503f)
                curveTo(13.2846f, 3.2511f, 13.784f, 3.2538f, 14.25f, 3.2627f)
                verticalLineTo(2.0f)
                curveTo(14.25f, 1.5858f, 14.5858f, 1.25f, 15.0f, 1.25f)
                curveTo(15.4142f, 1.25f, 15.75f, 1.5858f, 15.75f, 2.0f)
                verticalLineTo(3.3271f)
                curveTo(16.0099f, 3.3469f, 16.2561f, 3.3718f, 16.489f, 3.4031f)
                curveTo(17.6614f, 3.5608f, 18.6104f, 3.8929f, 19.3588f, 4.6412f)
                curveTo(20.1071f, 5.3896f, 20.4392f, 6.3386f, 20.5969f, 7.511f)
                curveTo(20.6282f, 7.7439f, 20.6531f, 7.9901f, 20.6729f, 8.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 8.25f, 22.75f, 8.5858f, 22.75f, 9.0f)
                curveTo(22.75f, 9.4142f, 22.4142f, 9.75f, 22.0f, 9.75f)
                horizontalLineTo(20.7373f)
                curveTo(20.7462f, 10.216f, 20.7489f, 10.7154f, 20.7497f, 11.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 11.25f, 22.75f, 11.5858f, 22.75f, 12.0f)
                curveTo(22.75f, 12.4142f, 22.4142f, 12.75f, 22.0f, 12.75f)
                horizontalLineTo(20.7497f)
                curveTo(20.7489f, 13.2846f, 20.7462f, 13.784f, 20.7373f, 14.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 14.25f, 22.75f, 14.5858f, 22.75f, 15.0f)
                curveTo(22.75f, 15.4142f, 22.4142f, 15.75f, 22.0f, 15.75f)
                horizontalLineTo(20.6729f)
                curveTo(20.6531f, 16.0099f, 20.6282f, 16.2561f, 20.5969f, 16.489f)
                curveTo(20.4392f, 17.6614f, 20.1071f, 18.6104f, 19.3588f, 19.3588f)
                curveTo(18.6104f, 20.1071f, 17.6614f, 20.4392f, 16.489f, 20.5969f)
                curveTo(16.2561f, 20.6282f, 16.0099f, 20.6531f, 15.75f, 20.6729f)
                verticalLineTo(22.0f)
                curveTo(15.75f, 22.4142f, 15.4142f, 22.75f, 15.0f, 22.75f)
                curveTo(14.5858f, 22.75f, 14.25f, 22.4142f, 14.25f, 22.0f)
                verticalLineTo(20.7373f)
                curveTo(13.784f, 20.7462f, 13.2846f, 20.7489f, 12.75f, 20.7497f)
                verticalLineTo(22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                verticalLineTo(20.7497f)
                curveTo(10.7154f, 20.7489f, 10.216f, 20.7462f, 9.75f, 20.7373f)
                verticalLineTo(22.0f)
                curveTo(9.75f, 22.4142f, 9.4142f, 22.75f, 9.0f, 22.75f)
                curveTo(8.5858f, 22.75f, 8.25f, 22.4142f, 8.25f, 22.0f)
                verticalLineTo(20.6729f)
                curveTo(7.9901f, 20.6531f, 7.7439f, 20.6282f, 7.511f, 20.5969f)
                curveTo(6.3386f, 20.4392f, 5.3896f, 20.1071f, 4.6412f, 19.3588f)
                curveTo(3.8929f, 18.6104f, 3.5608f, 17.6614f, 3.4031f, 16.489f)
                curveTo(3.3718f, 16.2561f, 3.3469f, 16.0099f, 3.3271f, 15.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 15.75f, 1.25f, 15.4142f, 1.25f, 15.0f)
                curveTo(1.25f, 14.5858f, 1.5858f, 14.25f, 2.0f, 14.25f)
                horizontalLineTo(3.2627f)
                curveTo(3.2538f, 13.784f, 3.2511f, 13.2846f, 3.2503f, 12.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 12.75f, 1.25f, 12.4142f, 1.25f, 12.0f)
                curveTo(1.25f, 11.5858f, 1.5858f, 11.25f, 2.0f, 11.25f)
                horizontalLineTo(3.2503f)
                curveTo(3.2511f, 10.7154f, 3.2538f, 10.216f, 3.2627f, 9.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 9.75f, 1.25f, 9.4142f, 1.25f, 9.0f)
                curveTo(1.25f, 8.5858f, 1.5858f, 8.25f, 2.0f, 8.25f)
                horizontalLineTo(3.3271f)
                curveTo(3.3469f, 7.9901f, 3.3718f, 7.7439f, 3.4031f, 7.511f)
                curveTo(3.5608f, 6.3386f, 3.8929f, 5.3896f, 4.6412f, 4.6412f)
                curveTo(5.3896f, 3.8929f, 6.3386f, 3.5608f, 7.511f, 3.4031f)
                curveTo(7.7439f, 3.3718f, 7.9901f, 3.3469f, 8.25f, 3.3271f)
                verticalLineTo(2.0f)
                curveTo(8.25f, 1.5858f, 8.5858f, 1.25f, 9.0f, 1.25f)
                close()
                moveTo(7.7108f, 4.8898f)
                curveTo(6.7048f, 5.025f, 6.1251f, 5.2787f, 5.7019f, 5.7019f)
                curveTo(5.2787f, 6.1251f, 5.025f, 6.7048f, 4.8898f, 7.7108f)
                curveTo(4.7516f, 8.7385f, 4.75f, 10.0932f, 4.75f, 12.0f)
                curveTo(4.75f, 13.9068f, 4.7516f, 15.2615f, 4.8898f, 16.2892f)
                curveTo(5.025f, 17.2952f, 5.2787f, 17.8749f, 5.7019f, 18.2981f)
                curveTo(6.1251f, 18.7213f, 6.7048f, 18.975f, 7.7108f, 19.1102f)
                curveTo(8.7385f, 19.2484f, 10.0932f, 19.25f, 12.0f, 19.25f)
                curveTo(13.9068f, 19.25f, 15.2615f, 19.2484f, 16.2892f, 19.1102f)
                curveTo(17.2952f, 18.975f, 17.8749f, 18.7213f, 18.2981f, 18.2981f)
                curveTo(18.7213f, 17.8749f, 18.975f, 17.2952f, 19.1102f, 16.2892f)
                curveTo(19.2484f, 15.2615f, 19.25f, 13.9068f, 19.25f, 12.0f)
                curveTo(19.25f, 10.0932f, 19.2484f, 8.7385f, 19.1102f, 7.7108f)
                curveTo(18.975f, 6.7048f, 18.7213f, 6.1251f, 18.2981f, 5.7019f)
                curveTo(17.8749f, 5.2787f, 17.2952f, 5.025f, 16.2892f, 4.8898f)
                curveTo(15.2615f, 4.7516f, 13.9068f, 4.75f, 12.0f, 4.75f)
                curveTo(10.0932f, 4.75f, 8.7385f, 4.7516f, 7.7108f, 4.8898f)
                close()
                moveTo(9.9506f, 6.25f)
                horizontalLineTo(14.0494f)
                curveTo(14.7142f, 6.25f, 15.2871f, 6.2499f, 15.7458f, 6.3116f)
                curveTo(16.2375f, 6.3777f, 16.7087f, 6.5268f, 17.091f, 6.909f)
                curveTo(17.4732f, 7.2913f, 17.6223f, 7.7625f, 17.6884f, 8.2542f)
                curveTo(17.7501f, 8.7129f, 17.75f, 9.2858f, 17.75f, 9.9506f)
                verticalLineTo(14.0494f)
                curveTo(17.75f, 14.7142f, 17.7501f, 15.2871f, 17.6884f, 15.7458f)
                curveTo(17.6223f, 16.2375f, 17.4732f, 16.7087f, 17.091f, 17.091f)
                curveTo(16.7087f, 17.4732f, 16.2375f, 17.6223f, 15.7458f, 17.6884f)
                curveTo(15.2871f, 17.7501f, 14.7142f, 17.75f, 14.0494f, 17.75f)
                horizontalLineTo(9.9506f)
                curveTo(9.2858f, 17.75f, 8.7129f, 17.7501f, 8.2542f, 17.6884f)
                curveTo(7.7625f, 17.6223f, 7.2913f, 17.4732f, 6.909f, 17.091f)
                curveTo(6.5268f, 16.7087f, 6.3777f, 16.2375f, 6.3116f, 15.7458f)
                curveTo(6.2499f, 15.2871f, 6.25f, 14.7142f, 6.25f, 14.0494f)
                verticalLineTo(9.9506f)
                curveTo(6.25f, 9.2858f, 6.2499f, 8.7129f, 6.3116f, 8.2542f)
                curveTo(6.3777f, 7.7625f, 6.5268f, 7.2913f, 6.909f, 6.909f)
                curveTo(7.2913f, 6.5268f, 7.7625f, 6.3777f, 8.2542f, 6.3116f)
                curveTo(8.7129f, 6.2499f, 9.2858f, 6.25f, 9.9506f, 6.25f)
                close()
                moveTo(8.454f, 7.7982f)
                curveTo(8.1287f, 7.842f, 8.0268f, 7.9126f, 7.9697f, 7.9697f)
                curveTo(7.9126f, 8.0268f, 7.842f, 8.1287f, 7.7982f, 8.454f)
                curveTo(7.7516f, 8.8009f, 7.75f, 9.2717f, 7.75f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(7.75f, 14.7283f, 7.7516f, 15.1991f, 7.7982f, 15.546f)
                curveTo(7.842f, 15.8713f, 7.9126f, 15.9732f, 7.9697f, 16.0303f)
                curveTo(8.0268f, 16.0874f, 8.1287f, 16.158f, 8.454f, 16.2018f)
                curveTo(8.8009f, 16.2484f, 9.2717f, 16.25f, 10.0f, 16.25f)
                horizontalLineTo(14.0f)
                curveTo(14.7283f, 16.25f, 15.1991f, 16.2484f, 15.546f, 16.2018f)
                curveTo(15.8713f, 16.158f, 15.9732f, 16.0874f, 16.0303f, 16.0303f)
                curveTo(16.0874f, 15.9732f, 16.158f, 15.8713f, 16.2018f, 15.546f)
                curveTo(16.2484f, 15.1991f, 16.25f, 14.7283f, 16.25f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(16.25f, 9.2717f, 16.2484f, 8.8009f, 16.2018f, 8.454f)
                curveTo(16.158f, 8.1287f, 16.0874f, 8.0268f, 16.0303f, 7.9697f)
                curveTo(15.9732f, 7.9126f, 15.8713f, 7.842f, 15.546f, 7.7982f)
                curveTo(15.1991f, 7.7516f, 14.7283f, 7.75f, 14.0f, 7.75f)
                horizontalLineTo(10.0f)
                curveTo(9.2717f, 7.75f, 8.8009f, 7.7516f, 8.454f, 7.7982f)
                close()
                moveTo(12.8645f, 9.3897f)
                curveTo(13.2016f, 9.6305f, 13.2796f, 10.0989f, 13.0389f, 10.4359f)
                lineTo(12.4574f, 11.25f)
                horizontalLineTo(13.0f)
                curveTo(13.2809f, 11.25f, 13.5383f, 11.407f, 13.6669f, 11.6568f)
                curveTo(13.7954f, 11.9066f, 13.7736f, 12.2073f, 13.6103f, 12.4359f)
                lineTo(12.1817f, 14.4359f)
                curveTo(11.941f, 14.773f, 11.4726f, 14.8511f, 11.1355f, 14.6103f)
                curveTo(10.7984f, 14.3695f, 10.7204f, 13.9011f, 10.9611f, 13.5641f)
                lineTo(11.5426f, 12.75f)
                horizontalLineTo(11.0f)
                curveTo(10.7191f, 12.75f, 10.4617f, 12.593f, 10.3331f, 12.3432f)
                curveTo(10.2046f, 12.0934f, 10.2264f, 11.7927f, 10.3897f, 11.5641f)
                lineTo(11.8183f, 9.5641f)
                curveTo(12.059f, 9.227f, 12.5274f, 9.1489f, 12.8645f, 9.3897f)
                close()
            }
        }
            .build()
        return _cpuBolt!!
    }

private var _cpuBolt: ImageVector? = null
