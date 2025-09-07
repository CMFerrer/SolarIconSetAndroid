package com.chiksmedina.solar.bold.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.DesignToolsGroup

val DesignToolsGroup.Pipette: ImageVector
    get() {
        if (_pipette != null) {
            return _pipette!!
        }
        _pipette = Builder(
            name = "Pipette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.2413f, 5.7531f)
                lineTo(18.2469f, 13.7587f)
                curveTo(18.8498f, 14.3616f, 19.8273f, 14.3616f, 20.4302f, 13.7587f)
                curveTo(21.0332f, 13.1558f, 21.0332f, 12.1783f, 20.4302f, 11.5754f)
                lineTo(19.3386f, 10.4837f)
                lineTo(20.7941f, 9.0281f)
                curveTo(22.4019f, 7.4203f, 22.4019f, 4.8136f, 20.7941f, 3.2058f)
                curveTo(19.1864f, 1.5981f, 16.5796f, 1.5981f, 14.9719f, 3.2058f)
                lineTo(13.5163f, 4.6614f)
                lineTo(12.4246f, 3.5697f)
                curveTo(11.8217f, 2.9668f, 10.8442f, 2.9668f, 10.2413f, 3.5697f)
                curveTo(9.6383f, 4.1726f, 9.6383f, 5.1502f, 10.2413f, 5.7531f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.2723f, 7.9054f)
                lineTo(4.7089f, 13.4688f)
                curveTo(4.2529f, 13.9248f, 4.0249f, 14.1528f, 3.8802f, 14.4259f)
                curveTo(3.7836f, 14.6081f, 3.715f, 14.8037f, 3.6766f, 15.0063f)
                curveTo(3.619f, 15.3099f, 3.6546f, 15.6304f, 3.7258f, 16.2713f)
                lineTo(3.7786f, 16.7466f)
                curveTo(3.7981f, 16.9215f, 3.8078f, 17.009f, 3.8102f, 17.0929f)
                curveTo(3.825f, 17.6013f, 3.6511f, 18.0973f, 3.3219f, 18.4851f)
                curveTo(3.2675f, 18.5491f, 3.2053f, 18.6113f, 3.0809f, 18.7357f)
                lineTo(2.4522f, 19.3644f)
                curveTo(1.8493f, 19.9673f, 1.8493f, 20.9449f, 2.4522f, 21.5478f)
                curveTo(3.0551f, 22.1507f, 4.0326f, 22.1507f, 4.6355f, 21.5478f)
                lineTo(5.2643f, 20.919f)
                curveTo(5.3887f, 20.7946f, 5.4509f, 20.7324f, 5.5149f, 20.6781f)
                curveTo(5.9027f, 20.3489f, 6.3986f, 20.1749f, 6.9071f, 20.1897f)
                curveTo(6.991f, 20.1922f, 7.0784f, 20.2019f, 7.2533f, 20.2213f)
                lineTo(7.7286f, 20.2742f)
                curveTo(8.3696f, 20.3454f, 8.69f, 20.381f, 8.9937f, 20.3234f)
                curveTo(9.1963f, 20.285f, 9.3919f, 20.2163f, 9.5741f, 20.1198f)
                curveTo(9.8472f, 19.9751f, 10.0752f, 19.7471f, 10.5312f, 19.2911f)
                lineTo(11.9696f, 17.8525f)
                lineTo(10.1162f, 15.9991f)
                curveTo(9.8233f, 15.7062f, 9.8233f, 15.2313f, 10.1162f, 14.9384f)
                curveTo(10.409f, 14.6455f, 10.8839f, 14.6455f, 11.1768f, 14.9384f)
                lineTo(13.0303f, 16.7919f)
                lineTo(13.9696f, 15.8525f)
                lineTo(12.1162f, 13.9991f)
                curveTo(11.8233f, 13.7062f, 11.8233f, 13.2313f, 12.1162f, 12.9384f)
                curveTo(12.409f, 12.6455f, 12.8839f, 12.6455f, 13.1768f, 12.9384f)
                lineTo(15.0303f, 14.7919f)
                lineTo(16.0945f, 13.7277f)
                lineTo(10.2723f, 7.9054f)
                close()
            }
        }
            .build()
        return _pipette!!
    }

private var _pipette: ImageVector? = null
