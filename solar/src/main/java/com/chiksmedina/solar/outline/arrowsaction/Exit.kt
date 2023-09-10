package com.chiksmedina.solar.outline.arrowsaction

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
import com.chiksmedina.solar.outline.ArrowsActionGroup

val ArrowsActionGroup.Exit: ImageVector
    get() {
        if (_exit != null) {
            return _exit!!
        }
        _exit = Builder(
            name = "Exit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 11.0f)
                curveTo(12.75f, 10.5858f, 12.4142f, 10.25f, 12.0f, 10.25f)
                curveTo(11.5858f, 10.25f, 11.25f, 10.5858f, 11.25f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(11.25f, 13.4142f, 11.5858f, 13.75f, 12.0f, 13.75f)
                curveTo(12.4142f, 13.75f, 12.75f, 13.4142f, 12.75f, 13.0f)
                verticalLineTo(11.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(13.7247f, 2.0271f)
                lineTo(16.1585f, 2.4327f)
                curveTo(17.3143f, 2.6253f, 18.2506f, 2.7814f, 18.9831f, 2.9994f)
                curveTo(19.7459f, 3.2265f, 20.3761f, 3.5447f, 20.8613f, 4.1175f)
                curveTo(21.3465f, 4.6902f, 21.5568f, 5.3642f, 21.6554f, 6.154f)
                curveTo(21.75f, 6.9123f, 21.75f, 7.8615f, 21.75f, 9.0332f)
                verticalLineTo(14.9667f)
                curveTo(21.75f, 16.1384f, 21.75f, 17.0877f, 21.6554f, 17.846f)
                curveTo(21.5568f, 18.6358f, 21.3465f, 19.3097f, 20.8613f, 19.8825f)
                curveTo(20.3761f, 20.4553f, 19.7459f, 20.7734f, 18.9831f, 21.0005f)
                curveTo(18.2506f, 21.2186f, 17.3143f, 21.3746f, 16.1586f, 21.5672f)
                lineTo(13.7247f, 21.9729f)
                curveTo(12.6915f, 22.1451f, 11.8373f, 22.2875f, 11.155f, 22.304f)
                curveTo(10.4394f, 22.3213f, 9.776f, 22.2063f, 9.2225f, 21.7374f)
                curveTo(8.7552f, 21.3416f, 8.5239f, 20.827f, 8.4026f, 20.25f)
                horizontalLineTo(7.9463f)
                curveTo(6.8135f, 20.25f, 5.8877f, 20.25f, 5.1569f, 20.1518f)
                curveTo(4.3929f, 20.0491f, 3.7306f, 19.8268f, 3.2019f, 19.2981f)
                curveTo(2.6732f, 18.7694f, 2.4509f, 18.1071f, 2.3482f, 17.3431f)
                curveTo(2.25f, 16.6123f, 2.25f, 15.6865f, 2.25f, 14.5537f)
                verticalLineTo(9.4463f)
                curveTo(2.25f, 8.3135f, 2.25f, 7.3877f, 2.3482f, 6.6569f)
                curveTo(2.4509f, 5.8929f, 2.6732f, 5.2306f, 3.2019f, 4.7019f)
                curveTo(3.7306f, 4.1732f, 4.3929f, 3.9509f, 5.1569f, 3.8482f)
                curveTo(5.8878f, 3.7499f, 6.8135f, 3.75f, 7.9463f, 3.75f)
                lineTo(8.4026f, 3.75f)
                curveTo(8.5238f, 3.173f, 8.7552f, 2.6584f, 9.2225f, 2.2626f)
                curveTo(9.776f, 1.7937f, 10.4394f, 1.6787f, 11.155f, 1.696f)
                curveTo(11.8373f, 1.7125f, 12.6916f, 1.8549f, 13.7247f, 2.0271f)
                close()
                moveTo(8.25f, 17.3351f)
                curveTo(8.25f, 17.8511f, 8.25f, 18.3231f, 8.2614f, 18.75f)
                horizontalLineTo(8.0f)
                curveTo(6.8003f, 18.75f, 5.9759f, 18.7484f, 5.3568f, 18.6652f)
                curveTo(4.7591f, 18.5848f, 4.4661f, 18.441f, 4.2626f, 18.2374f)
                curveTo(4.059f, 18.0339f, 3.9152f, 17.7409f, 3.8348f, 17.1432f)
                curveTo(3.7516f, 16.524f, 3.75f, 15.6997f, 3.75f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(3.75f, 8.3003f, 3.7516f, 7.4759f, 3.8348f, 6.8568f)
                curveTo(3.9152f, 6.2591f, 4.059f, 5.9661f, 4.2626f, 5.7626f)
                curveTo(4.4661f, 5.559f, 4.7591f, 5.4152f, 5.3568f, 5.3348f)
                curveTo(5.9759f, 5.2516f, 6.8003f, 5.25f, 8.0f, 5.25f)
                horizontalLineTo(8.2614f)
                curveTo(8.25f, 5.6769f, 8.25f, 6.1489f, 8.25f, 6.6649f)
                verticalLineTo(17.3351f)
                close()
                moveTo(11.1188f, 3.1955f)
                curveTo(10.5765f, 3.1824f, 10.3458f, 3.2769f, 10.192f, 3.4071f)
                curveTo(10.0383f, 3.5374f, 9.9072f, 3.7494f, 9.831f, 4.2865f)
                curveTo(9.7518f, 4.8443f, 9.75f, 5.603f, 9.75f, 6.7218f)
                verticalLineTo(17.2781f)
                curveTo(9.75f, 18.397f, 9.7518f, 19.1557f, 9.831f, 19.7135f)
                curveTo(9.9072f, 20.2506f, 10.0383f, 20.4626f, 10.192f, 20.5928f)
                curveTo(10.3458f, 20.7231f, 10.5765f, 20.8175f, 11.1188f, 20.8044f)
                curveTo(11.682f, 20.7908f, 12.4307f, 20.6679f, 13.5343f, 20.4839f)
                lineTo(15.8631f, 20.0958f)
                curveTo(17.0793f, 19.8931f, 17.9228f, 19.7511f, 18.5551f, 19.5629f)
                curveTo(19.1672f, 19.3806f, 19.4911f, 19.1794f, 19.7168f, 18.9129f)
                curveTo(19.9425f, 18.6465f, 20.0878f, 18.294f, 20.1669f, 17.6602f)
                curveTo(20.2486f, 17.0056f, 20.25f, 16.1502f, 20.25f, 14.9172f)
                verticalLineTo(9.0828f)
                curveTo(20.25f, 7.8497f, 20.2486f, 6.9944f, 20.1669f, 6.3398f)
                curveTo(20.0878f, 5.706f, 19.9425f, 5.3535f, 19.7168f, 5.087f)
                curveTo(19.4911f, 4.8206f, 19.1672f, 4.6193f, 18.5551f, 4.4371f)
                curveTo(17.9228f, 4.2488f, 17.0793f, 4.1069f, 15.8631f, 3.9042f)
                lineTo(13.5343f, 3.516f)
                curveTo(12.4307f, 3.3321f, 11.682f, 3.2091f, 11.1188f, 3.1955f)
                close()
            }
        }
            .build()
        return _exit!!
    }

private var _exit: ImageVector? = null
