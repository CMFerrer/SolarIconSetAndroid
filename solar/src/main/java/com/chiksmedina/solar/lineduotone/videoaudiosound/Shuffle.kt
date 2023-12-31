package com.chiksmedina.solar.lineduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

val VideoAudioSoundGroup.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(
            name = "Shuffle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 16.25f)
                curveTo(1.5858f, 16.25f, 1.25f, 16.5858f, 1.25f, 17.0f)
                curveTo(1.25f, 17.4142f, 1.5858f, 17.75f, 2.0f, 17.75f)
                verticalLineTo(16.25f)
                close()
                moveTo(10.7478f, 14.087f)
                lineTo(10.1047f, 13.7011f)
                lineTo(10.1047f, 13.7011f)
                lineTo(10.7478f, 14.087f)
                close()
                moveTo(13.2522f, 9.913f)
                lineTo(13.8953f, 10.2989f)
                lineTo(13.8953f, 10.2989f)
                lineTo(13.2522f, 9.913f)
                close()
                moveTo(22.0f, 7.0f)
                lineTo(22.5303f, 7.5303f)
                curveTo(22.8232f, 7.2374f, 22.8232f, 6.7626f, 22.5303f, 6.4697f)
                lineTo(22.0f, 7.0f)
                close()
                moveTo(19.4697f, 8.4697f)
                curveTo(19.1768f, 8.7626f, 19.1768f, 9.2374f, 19.4697f, 9.5303f)
                curveTo(19.7626f, 9.8232f, 20.2374f, 9.8232f, 20.5303f, 9.5303f)
                lineTo(19.4697f, 8.4697f)
                close()
                moveTo(20.5303f, 4.4697f)
                curveTo(20.2374f, 4.1768f, 19.7626f, 4.1768f, 19.4697f, 4.4697f)
                curveTo(19.1768f, 4.7626f, 19.1768f, 5.2374f, 19.4697f, 5.5303f)
                lineTo(20.5303f, 4.4697f)
                close()
                moveTo(15.2205f, 7.3894f)
                lineTo(14.851f, 6.7368f)
                lineTo(14.8509f, 6.7368f)
                lineTo(15.2205f, 7.3894f)
                close()
                moveTo(2.0f, 17.75f)
                horizontalLineTo(5.6029f)
                verticalLineTo(16.25f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.75f)
                close()
                moveTo(11.3909f, 14.4728f)
                lineTo(13.8953f, 10.2989f)
                lineTo(12.6091f, 9.5272f)
                lineTo(10.1047f, 13.7011f)
                lineTo(11.3909f, 14.4728f)
                close()
                moveTo(18.3971f, 7.75f)
                horizontalLineTo(22.0f)
                verticalLineTo(6.25f)
                horizontalLineTo(18.3971f)
                verticalLineTo(7.75f)
                close()
                moveTo(21.4697f, 6.4697f)
                lineTo(19.4697f, 8.4697f)
                lineTo(20.5303f, 9.5303f)
                lineTo(22.5303f, 7.5303f)
                lineTo(21.4697f, 6.4697f)
                close()
                moveTo(22.5303f, 6.4697f)
                lineTo(20.5303f, 4.4697f)
                lineTo(19.4697f, 5.5303f)
                lineTo(21.4697f, 7.5303f)
                lineTo(22.5303f, 6.4697f)
                close()
                moveTo(13.8953f, 10.2989f)
                curveTo(14.3295f, 9.5752f, 14.6286f, 9.0783f, 14.9013f, 8.71f)
                curveTo(15.1644f, 8.3546f, 15.3692f, 8.1671f, 15.59f, 8.0421f)
                lineTo(14.8509f, 6.7368f)
                curveTo(14.384f, 7.0011f, 14.0315f, 7.364f, 13.6958f, 7.8174f)
                curveTo(13.3697f, 8.2578f, 13.0285f, 8.8281f, 12.6091f, 9.5272f)
                lineTo(13.8953f, 10.2989f)
                close()
                moveTo(18.3971f, 6.25f)
                curveTo(17.5819f, 6.25f, 16.9173f, 6.2492f, 16.3719f, 6.3022f)
                curveTo(15.8104f, 6.3568f, 15.3179f, 6.4724f, 14.851f, 6.7368f)
                lineTo(15.59f, 8.0421f)
                curveTo(15.8108f, 7.917f, 16.077f, 7.8379f, 16.517f, 7.7952f)
                curveTo(16.9733f, 7.7508f, 17.5531f, 7.75f, 18.3971f, 7.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(5.6029f, 17.75f)
                curveTo(6.4181f, 17.75f, 7.0827f, 17.7508f, 7.6281f, 17.6978f)
                curveTo(8.1896f, 17.6432f, 8.6821f, 17.5276f, 9.149f, 17.2632f)
                lineTo(8.41f, 15.9579f)
                curveTo(8.1892f, 16.083f, 7.923f, 16.1621f, 7.483f, 16.2048f)
                curveTo(7.0268f, 16.2492f, 6.4468f, 16.25f, 5.6029f, 16.25f)
                verticalLineTo(17.75f)
                close()
                moveTo(10.1047f, 13.7011f)
                curveTo(9.6705f, 14.4248f, 9.3714f, 14.9217f, 9.0987f, 15.29f)
                curveTo(8.8356f, 15.6454f, 8.6308f, 15.8329f, 8.41f, 15.9579f)
                lineTo(9.149f, 17.2632f)
                curveTo(9.616f, 16.9989f, 9.9685f, 16.636f, 10.3042f, 16.1826f)
                curveTo(10.6303f, 15.7422f, 10.9715f, 15.1719f, 11.3909f, 14.4728f)
                lineTo(10.1047f, 13.7011f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 7.75f)
                curveTo(1.5858f, 7.75f, 1.25f, 7.4142f, 1.25f, 7.0f)
                curveTo(1.25f, 6.5858f, 1.5858f, 6.25f, 2.0f, 6.25f)
                verticalLineTo(7.75f)
                close()
                moveTo(10.7478f, 9.913f)
                lineTo(10.1047f, 10.2989f)
                lineTo(10.1047f, 10.2989f)
                lineTo(10.7478f, 9.913f)
                close()
                moveTo(13.2522f, 14.087f)
                lineTo(13.8953f, 13.7011f)
                lineTo(13.8953f, 13.7011f)
                lineTo(13.2522f, 14.087f)
                close()
                moveTo(22.0f, 17.0f)
                lineTo(22.5303f, 16.4697f)
                curveTo(22.8232f, 16.7626f, 22.8232f, 17.2374f, 22.5303f, 17.5303f)
                lineTo(22.0f, 17.0f)
                close()
                moveTo(19.4697f, 15.5303f)
                curveTo(19.1768f, 15.2374f, 19.1768f, 14.7626f, 19.4697f, 14.4697f)
                curveTo(19.7626f, 14.1768f, 20.2374f, 14.1768f, 20.5303f, 14.4697f)
                lineTo(19.4697f, 15.5303f)
                close()
                moveTo(20.5303f, 19.5303f)
                curveTo(20.2374f, 19.8232f, 19.7626f, 19.8232f, 19.4697f, 19.5303f)
                curveTo(19.1768f, 19.2374f, 19.1768f, 18.7626f, 19.4697f, 18.4697f)
                lineTo(20.5303f, 19.5303f)
                close()
                moveTo(15.2205f, 16.6106f)
                lineTo(14.851f, 17.2632f)
                lineTo(14.8509f, 17.2632f)
                lineTo(15.2205f, 16.6106f)
                close()
                moveTo(2.0f, 6.25f)
                horizontalLineTo(5.6029f)
                verticalLineTo(7.75f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.25f)
                close()
                moveTo(11.3909f, 9.5272f)
                lineTo(13.8953f, 13.7011f)
                lineTo(12.6091f, 14.4728f)
                lineTo(10.1047f, 10.2989f)
                lineTo(11.3909f, 9.5272f)
                close()
                moveTo(18.3971f, 16.25f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.75f)
                horizontalLineTo(18.3971f)
                verticalLineTo(16.25f)
                close()
                moveTo(21.4697f, 17.5303f)
                lineTo(19.4697f, 15.5303f)
                lineTo(20.5303f, 14.4697f)
                lineTo(22.5303f, 16.4697f)
                lineTo(21.4697f, 17.5303f)
                close()
                moveTo(22.5303f, 17.5303f)
                lineTo(20.5303f, 19.5303f)
                lineTo(19.4697f, 18.4697f)
                lineTo(21.4697f, 16.4697f)
                lineTo(22.5303f, 17.5303f)
                close()
                moveTo(13.8953f, 13.7011f)
                curveTo(14.3295f, 14.4248f, 14.6286f, 14.9217f, 14.9013f, 15.29f)
                curveTo(15.1644f, 15.6454f, 15.3692f, 15.8329f, 15.59f, 15.9579f)
                lineTo(14.8509f, 17.2632f)
                curveTo(14.384f, 16.9989f, 14.0315f, 16.636f, 13.6958f, 16.1826f)
                curveTo(13.3697f, 15.7422f, 13.0285f, 15.1719f, 12.6091f, 14.4728f)
                lineTo(13.8953f, 13.7011f)
                close()
                moveTo(18.3971f, 17.75f)
                curveTo(17.5819f, 17.75f, 16.9173f, 17.7508f, 16.3719f, 17.6978f)
                curveTo(15.8104f, 17.6432f, 15.3179f, 17.5276f, 14.851f, 17.2632f)
                lineTo(15.59f, 15.9579f)
                curveTo(15.8108f, 16.083f, 16.077f, 16.1621f, 16.517f, 16.2048f)
                curveTo(16.9733f, 16.2492f, 17.5531f, 16.25f, 18.3971f, 16.25f)
                verticalLineTo(17.75f)
                close()
                moveTo(5.6029f, 6.25f)
                curveTo(6.4181f, 6.25f, 7.0827f, 6.2492f, 7.6281f, 6.3022f)
                curveTo(8.1896f, 6.3568f, 8.6821f, 6.4724f, 9.149f, 6.7368f)
                lineTo(8.41f, 8.0421f)
                curveTo(8.1892f, 7.917f, 7.923f, 7.8379f, 7.483f, 7.7952f)
                curveTo(7.0268f, 7.7508f, 6.4468f, 7.75f, 5.6029f, 7.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(10.1047f, 10.2989f)
                curveTo(9.6705f, 9.5752f, 9.3714f, 9.0783f, 9.0987f, 8.71f)
                curveTo(8.8356f, 8.3546f, 8.6308f, 8.1671f, 8.41f, 8.0421f)
                lineTo(9.149f, 6.7368f)
                curveTo(9.616f, 7.0011f, 9.9685f, 7.364f, 10.3042f, 7.8174f)
                curveTo(10.6303f, 8.2578f, 10.9715f, 8.8281f, 11.3909f, 9.5272f)
                lineTo(10.1047f, 10.2989f)
                close()
            }
        }
            .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
