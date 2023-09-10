package com.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.Accessibility: ImageVector
    get() {
        if (_accessibility != null) {
            return _accessibility!!
        }
        _accessibility = Builder(
            name = "Accessibility", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0002f, 9.0f)
                curveTo(13.1048f, 9.0f, 14.0002f, 8.1046f, 14.0002f, 7.0f)
                curveTo(14.0002f, 5.8954f, 13.1048f, 5.0f, 12.0002f, 5.0f)
                curveTo(10.8956f, 5.0f, 10.0002f, 5.8954f, 10.0002f, 7.0f)
                curveTo(10.0002f, 8.1046f, 10.8956f, 9.0f, 12.0002f, 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(6.2928f, 9.3095f)
                curveTo(5.9115f, 9.1479f, 5.4714f, 9.3259f, 5.3097f, 9.7072f)
                curveTo(5.148f, 10.0885f, 5.326f, 10.5288f, 5.7074f, 10.6905f)
                lineTo(5.7087f, 10.691f)
                lineTo(5.7113f, 10.6921f)
                lineTo(5.7204f, 10.696f)
                lineTo(5.7534f, 10.7097f)
                curveTo(5.7819f, 10.7215f, 5.8231f, 10.7385f, 5.8761f, 10.7599f)
                curveTo(5.9819f, 10.8026f, 6.1346f, 10.8631f, 6.325f, 10.9355f)
                curveTo(6.7053f, 11.08f, 7.2385f, 11.2726f, 7.8516f, 11.4654f)
                curveTo(8.8405f, 11.7765f, 10.088f, 12.1049f, 11.2502f, 12.2131f)
                verticalLineTo(13.4522f)
                curveTo(11.2502f, 13.8837f, 11.1262f, 14.306f, 10.8928f, 14.6689f)
                lineTo(8.3693f, 18.5944f)
                curveTo(8.1453f, 18.9429f, 8.2462f, 19.4069f, 8.5946f, 19.6309f)
                curveTo(8.9431f, 19.8549f, 9.4071f, 19.754f, 9.6311f, 19.4056f)
                lineTo(12.0002f, 15.7203f)
                lineTo(14.3693f, 19.4056f)
                curveTo(14.5933f, 19.754f, 15.0573f, 19.8549f, 15.4058f, 19.6309f)
                curveTo(15.7542f, 19.4069f, 15.8551f, 18.9429f, 15.6311f, 18.5944f)
                lineTo(13.1075f, 14.6689f)
                curveTo(12.8742f, 14.306f, 12.7502f, 13.8837f, 12.7502f, 13.4522f)
                verticalLineTo(12.2131f)
                curveTo(13.9124f, 12.1049f, 15.1599f, 11.7765f, 16.1488f, 11.4654f)
                curveTo(16.7619f, 11.2726f, 17.2951f, 11.08f, 17.6754f, 10.9355f)
                curveTo(17.8658f, 10.8631f, 18.0185f, 10.8026f, 18.1243f, 10.7599f)
                curveTo(18.1773f, 10.7385f, 18.2185f, 10.7215f, 18.247f, 10.7097f)
                lineTo(18.28f, 10.696f)
                lineTo(18.2891f, 10.6921f)
                lineTo(18.2917f, 10.691f)
                lineTo(18.2928f, 10.6906f)
                curveTo(18.6741f, 10.5289f, 18.8524f, 10.0885f, 18.6907f, 9.7072f)
                curveTo(18.529f, 9.3259f, 18.0887f, 9.1479f, 17.7074f, 9.3095f)
                lineTo(17.6999f, 9.3127f)
                lineTo(17.6727f, 9.324f)
                curveTo(17.6482f, 9.3342f, 17.6111f, 9.3494f, 17.5625f, 9.3691f)
                curveTo(17.4653f, 9.4083f, 17.3223f, 9.465f, 17.1426f, 9.5333f)
                curveTo(16.7828f, 9.67f, 16.2777f, 9.8524f, 15.6987f, 10.0346f)
                curveTo(14.5205f, 10.4052f, 13.1114f, 10.75f, 12.0002f, 10.75f)
                curveTo(10.8889f, 10.75f, 9.4799f, 10.4052f, 8.3017f, 10.0346f)
                curveTo(7.7226f, 9.8524f, 7.2176f, 9.67f, 6.8578f, 9.5333f)
                curveTo(6.6781f, 9.465f, 6.5351f, 9.4083f, 6.4379f, 9.3691f)
                curveTo(6.3893f, 9.3494f, 6.3522f, 9.3342f, 6.3277f, 9.324f)
                lineTo(6.3005f, 9.3127f)
                lineTo(6.2942f, 9.31f)
                lineTo(6.2928f, 9.3095f)
                close()
            }
        }
            .build()
        return _accessibility!!
    }

private var _accessibility: ImageVector? = null
