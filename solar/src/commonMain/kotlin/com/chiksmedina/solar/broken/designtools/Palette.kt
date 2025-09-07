package com.chiksmedina.solar.broken.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.DesignToolsGroup

val DesignToolsGroup.Palette: ImageVector
    get() {
        if (_palette != null) {
            return _palette!!
        }
        _palette = Builder(
            name = "Palette", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 8.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.5999f, 2.0f, 3.8998f, 2.2725f, 3.365f)
                curveTo(2.5122f, 2.8946f, 2.8946f, 2.5122f, 3.365f, 2.2725f)
                curveTo(3.8998f, 2.0f, 4.5999f, 2.0f, 6.0f, 2.0f)
                curveTo(7.4001f, 2.0f, 8.1002f, 2.0f, 8.635f, 2.2725f)
                curveTo(9.1054f, 2.5122f, 9.4878f, 2.8946f, 9.7275f, 3.365f)
                curveTo(10.0f, 3.8998f, 10.0f, 4.5999f, 10.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(10.0f, 19.4001f, 10.0f, 20.1002f, 9.7275f, 20.635f)
                curveTo(9.4878f, 21.1054f, 9.1054f, 21.4878f, 8.635f, 21.7275f)
                curveTo(8.1002f, 22.0f, 7.4001f, 22.0f, 6.0f, 22.0f)
                curveTo(4.5999f, 22.0f, 3.8998f, 22.0f, 3.365f, 21.7275f)
                curveTo(2.8946f, 21.4878f, 2.5122f, 21.1054f, 2.2725f, 20.635f)
                curveTo(2.0f, 20.1002f, 2.0f, 19.4001f, 2.0f, 18.0f)
                verticalLineTo(12.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 19.0f)
                horizontalLineTo(5.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.3137f, 4.9291f)
                lineTo(11.1716f, 7.0712f)
                curveTo(10.5935f, 7.6493f, 10.3045f, 7.9383f, 10.1522f, 8.3059f)
                curveTo(10.0f, 8.6734f, 10.0f, 9.0821f, 10.0f, 9.8996f)
                lineTo(10.0f, 19.5565f)
                lineTo(18.9705f, 10.586f)
                curveTo(19.9606f, 9.5959f, 20.4556f, 9.1009f, 20.6411f, 8.5301f)
                curveTo(20.8042f, 8.028f, 20.8042f, 7.4871f, 20.6411f, 6.985f)
                curveTo(20.4556f, 6.4142f, 19.9606f, 5.9192f, 18.9705f, 4.9291f)
                curveTo(17.9805f, 3.9391f, 17.4855f, 3.4441f, 16.9146f, 3.2586f)
                curveTo(16.4125f, 3.0954f, 15.8717f, 3.0954f, 15.3695f, 3.2586f)
                curveTo(14.7987f, 3.4441f, 14.3037f, 3.9391f, 13.3137f, 4.9291f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0f, 22.0f)
                lineTo(18.0f, 21.25f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(18.0f, 14.0f)
                lineTo(18.0f, 14.75f)
                lineTo(18.0f, 14.0f)
                close()
                moveTo(22.0f, 18.0f)
                lineTo(21.25f, 18.0f)
                lineTo(22.0f, 18.0f)
                close()
                moveTo(21.7275f, 20.635f)
                lineTo(21.0593f, 20.2945f)
                lineTo(21.0593f, 20.2945f)
                lineTo(21.7275f, 20.635f)
                close()
                moveTo(20.635f, 21.7275f)
                lineTo(20.2945f, 21.0593f)
                lineTo(20.2945f, 21.0593f)
                lineTo(20.635f, 21.7275f)
                close()
                moveTo(21.7275f, 15.365f)
                lineTo(21.0593f, 15.7055f)
                lineTo(21.0593f, 15.7055f)
                lineTo(21.7275f, 15.365f)
                close()
                moveTo(20.635f, 14.2725f)
                lineTo(20.2945f, 14.9407f)
                lineTo(20.2945f, 14.9407f)
                lineTo(20.635f, 14.2725f)
                close()
                moveTo(13.0f, 22.75f)
                curveTo(13.4142f, 22.75f, 13.75f, 22.4142f, 13.75f, 22.0f)
                curveTo(13.75f, 21.5858f, 13.4142f, 21.25f, 13.0f, 21.25f)
                lineTo(13.0f, 22.75f)
                close()
                moveTo(17.0f, 21.25f)
                curveTo(16.5858f, 21.25f, 16.25f, 21.5858f, 16.25f, 22.0f)
                curveTo(16.25f, 22.4142f, 16.5858f, 22.75f, 17.0f, 22.75f)
                verticalLineTo(21.25f)
                close()
                moveTo(15.5f, 14.75f)
                lineTo(18.0f, 14.75f)
                lineTo(18.0f, 13.25f)
                lineTo(15.5f, 13.25f)
                lineTo(15.5f, 14.75f)
                close()
                moveTo(21.25f, 18.0f)
                curveTo(21.25f, 18.7124f, 21.2494f, 19.2017f, 21.2184f, 19.5809f)
                curveTo(21.1882f, 19.9514f, 21.1327f, 20.1504f, 21.0593f, 20.2945f)
                lineTo(22.3958f, 20.9755f)
                curveTo(22.5949f, 20.5847f, 22.6756f, 20.1663f, 22.7134f, 19.7031f)
                curveTo(22.7506f, 19.2486f, 22.75f, 18.6877f, 22.75f, 18.0f)
                lineTo(21.25f, 18.0f)
                close()
                moveTo(18.0f, 22.75f)
                curveTo(18.6877f, 22.75f, 19.2486f, 22.7506f, 19.7031f, 22.7134f)
                curveTo(20.1663f, 22.6756f, 20.5847f, 22.5949f, 20.9755f, 22.3958f)
                lineTo(20.2945f, 21.0593f)
                curveTo(20.1504f, 21.1327f, 19.9514f, 21.1882f, 19.5809f, 21.2184f)
                curveTo(19.2017f, 21.2494f, 18.7124f, 21.25f, 18.0f, 21.25f)
                lineTo(18.0f, 22.75f)
                close()
                moveTo(21.0593f, 20.2945f)
                curveTo(20.8915f, 20.6238f, 20.6238f, 20.8915f, 20.2945f, 21.0593f)
                lineTo(20.9755f, 22.3958f)
                curveTo(21.587f, 22.0842f, 22.0842f, 21.587f, 22.3958f, 20.9755f)
                lineTo(21.0593f, 20.2945f)
                close()
                moveTo(22.75f, 18.0f)
                curveTo(22.75f, 17.3123f, 22.7506f, 16.7514f, 22.7134f, 16.2969f)
                curveTo(22.6756f, 15.8337f, 22.5949f, 15.4153f, 22.3958f, 15.0245f)
                lineTo(21.0593f, 15.7055f)
                curveTo(21.1327f, 15.8496f, 21.1882f, 16.0486f, 21.2184f, 16.4191f)
                curveTo(21.2494f, 16.7983f, 21.25f, 17.2876f, 21.25f, 18.0f)
                lineTo(22.75f, 18.0f)
                close()
                moveTo(18.0f, 14.75f)
                curveTo(18.7124f, 14.75f, 19.2017f, 14.7506f, 19.5809f, 14.7816f)
                curveTo(19.9514f, 14.8118f, 20.1504f, 14.8673f, 20.2945f, 14.9407f)
                lineTo(20.9755f, 13.6042f)
                curveTo(20.5847f, 13.4051f, 20.1663f, 13.3244f, 19.7031f, 13.2866f)
                curveTo(19.2486f, 13.2494f, 18.6877f, 13.25f, 18.0f, 13.25f)
                lineTo(18.0f, 14.75f)
                close()
                moveTo(22.3958f, 15.0245f)
                curveTo(22.0842f, 14.413f, 21.587f, 13.9158f, 20.9755f, 13.6042f)
                lineTo(20.2945f, 14.9407f)
                curveTo(20.6238f, 15.1085f, 20.8915f, 15.3762f, 21.0593f, 15.7055f)
                lineTo(22.3958f, 15.0245f)
                close()
                moveTo(13.0f, 21.25f)
                lineTo(6.0f, 21.25f)
                lineTo(6.0f, 22.75f)
                lineTo(13.0f, 22.75f)
                lineTo(13.0f, 21.25f)
                close()
                moveTo(18.0f, 21.25f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.75f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.25f)
                close()
            }
        }
            .build()
        return _palette!!
    }

private var _palette: ImageVector? = null
