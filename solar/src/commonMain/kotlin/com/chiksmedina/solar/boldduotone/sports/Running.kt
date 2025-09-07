package com.chiksmedina.solar.boldduotone.sports

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
import com.chiksmedina.solar.boldduotone.SportsGroup

val SportsGroup.Running: ImageVector
    get() {
        if (_running != null) {
            return _running!!
        }
        _running = Builder(
            name = "Running", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.7501f, 4.5f)
                curveTo(20.7501f, 5.8807f, 19.6308f, 7.0f, 18.2501f, 7.0f)
                curveTo(16.8694f, 7.0f, 15.7501f, 5.8807f, 15.7501f, 4.5f)
                curveTo(15.7501f, 3.1193f, 16.8694f, 2.0f, 18.2501f, 2.0f)
                curveTo(19.6308f, 2.0f, 20.7501f, 3.1193f, 20.7501f, 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.8023f, 5.9306f)
                curveTo(10.0118f, 5.9017f, 10.2601f, 5.8754f, 10.5231f, 5.887f)
                curveTo(10.6031f, 5.8906f, 10.694f, 5.8971f, 10.7964f, 5.9077f)
                curveTo(13.179f, 6.155f, 14.9469f, 7.9432f, 16.1244f, 9.7093f)
                lineTo(16.1867f, 9.8028f)
                curveTo(16.7895f, 10.7069f, 17.8042f, 11.25f, 18.8908f, 11.25f)
                horizontalLineTo(20.7501f)
                curveTo(21.1643f, 11.25f, 21.5001f, 11.5858f, 21.5001f, 12.0f)
                curveTo(21.5001f, 12.4142f, 21.1643f, 12.75f, 20.7501f, 12.75f)
                horizontalLineTo(18.8908f)
                curveTo(17.3027f, 12.75f, 15.8196f, 11.9563f, 14.9386f, 10.6349f)
                lineTo(14.8763f, 10.5414f)
                curveTo(14.6038f, 10.1327f, 14.3111f, 9.7447f, 13.999f, 9.3894f)
                lineTo(12.115f, 11.7441f)
                curveTo(11.6876f, 12.2783f, 11.4009f, 12.6379f, 11.2077f, 12.9334f)
                curveTo(11.0206f, 13.2196f, 10.9671f, 13.3792f, 10.9529f, 13.5003f)
                curveTo(10.9295f, 13.7003f, 10.9547f, 13.903f, 11.0264f, 14.0911f)
                curveTo(11.0699f, 14.2051f, 11.1608f, 14.3467f, 11.4125f, 14.5783f)
                curveTo(11.6722f, 14.8173f, 12.0383f, 15.0957f, 12.5836f, 15.5088f)
                curveTo(12.6159f, 15.5332f, 12.6477f, 15.5573f, 12.679f, 15.5811f)
                curveTo(13.3999f, 16.1267f, 13.8991f, 16.5046f, 14.2445f, 17.0094f)
                curveTo(14.4409f, 17.2964f, 14.5964f, 17.6093f, 14.7066f, 17.9392f)
                curveTo(14.9004f, 18.5194f, 14.9001f, 19.1454f, 14.8998f, 20.0495f)
                curveTo(14.8998f, 20.0888f, 14.8997f, 20.1287f, 14.8997f, 20.1692f)
                verticalLineTo(21.9998f)
                curveTo(14.8997f, 22.414f, 14.564f, 22.7498f, 14.1497f, 22.7498f)
                curveTo(13.7355f, 22.7498f, 13.3997f, 22.414f, 13.3997f, 21.9998f)
                verticalLineTo(20.1692f)
                curveTo(13.3997f, 19.0986f, 13.3907f, 18.7342f, 13.2838f, 18.4143f)
                curveTo(13.2177f, 18.2164f, 13.1244f, 18.0287f, 13.0066f, 17.8565f)
                curveTo(12.8162f, 17.5782f, 12.5312f, 17.3509f, 11.6778f, 16.7045f)
                lineTo(11.649f, 16.6826f)
                curveTo(11.1399f, 16.2969f, 10.7156f, 15.9755f, 10.3966f, 15.682f)
                curveTo(10.0636f, 15.3754f, 9.7856f, 15.0471f, 9.6249f, 14.6256f)
                curveTo(9.467f, 14.2116f, 9.4115f, 13.7657f, 9.4631f, 13.3257f)
                curveTo(9.5156f, 12.8776f, 9.7046f, 12.4912f, 9.9523f, 12.1124f)
                curveTo(10.1896f, 11.7496f, 10.5222f, 11.3339f, 10.9212f, 10.8353f)
                lineTo(12.9048f, 8.356f)
                curveTo(12.2176f, 7.8332f, 11.461f, 7.4847f, 10.6415f, 7.3997f)
                curveTo(10.5674f, 7.392f, 10.506f, 7.3877f, 10.4567f, 7.3856f)
                curveTo(10.3288f, 7.3799f, 10.1856f, 7.3919f, 10.0075f, 7.4165f)
                curveTo(8.9422f, 7.5636f, 7.8746f, 8.1555f, 5.5563f, 9.4727f)
                lineTo(4.1206f, 10.2884f)
                curveTo(3.7605f, 10.4931f, 3.3027f, 10.367f, 3.098f, 10.0069f)
                curveTo(2.8934f, 9.6467f, 3.0195f, 9.1889f, 3.3796f, 8.9843f)
                lineTo(4.8153f, 8.1685f)
                curveTo(4.8665f, 8.1394f, 4.9173f, 8.1106f, 4.9676f, 8.082f)
                curveTo(7.0867f, 6.8776f, 8.4161f, 6.122f, 9.8023f, 5.9306f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.2301f, 16.4239f)
                curveTo(9.5484f, 16.689f, 9.5913f, 17.1619f, 9.3262f, 17.4802f)
                lineTo(8.3254f, 18.6811f)
                lineTo(8.2289f, 18.7969f)
                curveTo(7.5869f, 19.5686f, 7.1156f, 20.135f, 6.4576f, 20.4432f)
                curveTo(5.7996f, 20.7514f, 5.0627f, 20.7508f, 4.0589f, 20.7501f)
                horizontalLineTo(4.0589f)
                lineTo(3.9081f, 20.75f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 20.75f, 2.0f, 20.4142f, 2.0f, 20.0f)
                curveTo(2.0f, 19.5858f, 2.3358f, 19.25f, 2.75f, 19.25f)
                horizontalLineTo(3.9081f)
                curveTo(5.1297f, 19.25f, 5.504f, 19.2334f, 5.8213f, 19.0848f)
                curveTo(6.1387f, 18.9362f, 6.391f, 18.6593f, 7.1731f, 17.7208f)
                lineTo(8.1738f, 16.5199f)
                curveTo(8.439f, 16.2017f, 8.9119f, 16.1587f, 9.2301f, 16.4239f)
                close()
            }
        }
            .build()
        return _running!!
    }

private var _running: ImageVector? = null
