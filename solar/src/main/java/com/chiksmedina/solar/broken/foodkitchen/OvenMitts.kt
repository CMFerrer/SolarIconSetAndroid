package com.chiksmedina.solar.broken.foodkitchen

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
import com.chiksmedina.solar.broken.FoodKitchenGroup

val FoodKitchenGroup.OvenMitts: ImageVector
    get() {
        if (_ovenMitts != null) {
            return _ovenMitts!!
        }
        _ovenMitts = Builder(
            name = "OvenMitts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.1326f, 17.0254f)
                curveTo(9.4282f, 17.3156f, 9.903f, 17.3112f, 10.1932f, 17.0156f)
                curveTo(10.4833f, 16.72f, 10.479f, 16.2452f, 10.1834f, 15.955f)
                lineTo(9.1326f, 17.0254f)
                close()
                moveTo(12.4973f, 18.2174f)
                curveTo(12.1986f, 17.9304f, 11.7238f, 17.9399f, 11.4369f, 18.2386f)
                curveTo(11.1499f, 18.5373f, 11.1593f, 19.0121f, 11.458f, 19.299f)
                lineTo(12.4973f, 18.2174f)
                close()
                moveTo(10.1834f, 15.955f)
                lineTo(4.544f, 10.4189f)
                lineTo(3.4931f, 11.4893f)
                lineTo(9.1326f, 17.0254f)
                lineTo(10.1834f, 15.955f)
                close()
                moveTo(13.817f, 19.4855f)
                lineTo(12.4973f, 18.2174f)
                lineTo(11.458f, 19.299f)
                lineTo(12.7777f, 20.5671f)
                lineTo(13.817f, 19.4855f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0188f, 16.5368f)
                curveTo(2.6729f, 15.221f, 2.0f, 14.563f, 2.0f, 13.7454f)
                curveTo(2.0f, 13.2089f, 2.2897f, 12.7412f, 2.8692f, 12.1112f)
                curveTo(3.4604f, 11.4685f, 3.7559f, 11.1471f, 3.8897f, 10.8109f)
                curveTo(4.0234f, 10.4748f, 4.0271f, 10.0967f, 4.0343f, 9.3406f)
                lineTo(4.0665f, 5.9992f)
                curveTo(4.0322f, 3.8173f, 5.4409f, 2.0269f, 7.213f, 2.0003f)
                curveTo(8.6676f, 1.9784f, 9.9148f, 3.1516f, 10.3341f, 4.7793f)
                moveTo(20.0783f, 13.3965f)
                curveTo(22.6406f, 10.8913f, 22.6406f, 6.8295f, 20.0783f, 4.3243f)
                curveTo(17.516f, 1.8191f, 13.3618f, 1.8191f, 10.7995f, 4.3243f)
                lineTo(10.3341f, 4.7793f)
                moveTo(10.3341f, 4.7793f)
                lineTo(9.372f, 5.72f)
                moveTo(17.4155f, 16.0f)
                lineTo(16.688f, 16.7113f)
                lineTo(13.2976f, 20.0262f)
                curveTo(11.9518f, 21.342f, 11.2788f, 22.0f, 10.4426f, 22.0f)
                curveTo(9.6064f, 22.0f, 8.9334f, 21.3421f, 7.5876f, 20.0262f)
                lineTo(6.517f, 18.9794f)
            }
        }
            .build()
        return _ovenMitts!!
    }

private var _ovenMitts: ImageVector? = null
