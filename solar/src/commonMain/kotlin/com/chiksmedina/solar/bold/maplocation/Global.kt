package com.chiksmedina.solar.bold.maplocation

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
import com.chiksmedina.solar.bold.MapLocationGroup

val MapLocationGroup.Global: ImageVector
    get() {
        if (_global != null) {
            return _global!!
        }
        _global = Builder(
            name = "Global", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(2.0278f, 11.25f)
                curveTo(2.4114f, 6.0774f, 6.7296f, 2.0f, 12.0001f, 2.0f)
                curveTo(11.1693f, 2.0f, 10.4295f, 2.3642f, 9.8209f, 2.9211f)
                curveTo(9.2154f, 3.4753f, 8.7037f, 4.2488f, 8.2898f, 5.1631f)
                curveTo(7.8735f, 6.0829f, 7.5501f, 7.1587f, 7.3313f, 8.3261f)
                curveTo(7.1558f, 9.2619f, 7.049f, 10.2485f, 7.0134f, 11.25f)
                horizontalLineTo(2.0278f)
                close()
                moveTo(2.0278f, 12.75f)
                horizontalLineTo(7.0134f)
                curveTo(7.049f, 13.7515f, 7.1558f, 14.7381f, 7.3313f, 15.6739f)
                curveTo(7.5501f, 16.8413f, 7.8735f, 17.9171f, 8.2898f, 18.8368f)
                curveTo(8.7037f, 19.7512f, 9.2154f, 20.5247f, 9.8209f, 21.0789f)
                curveTo(10.4295f, 21.6358f, 11.1693f, 22.0f, 12.0001f, 22.0f)
                curveTo(6.7296f, 22.0f, 2.4114f, 17.9226f, 2.0278f, 12.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0001f, 3.3953f)
                curveTo(11.7251f, 3.3953f, 11.3699f, 3.5124f, 10.9567f, 3.8904f)
                curveTo(10.5406f, 4.2713f, 10.1239f, 4.8682f, 9.7558f, 5.6814f)
                curveTo(9.3902f, 6.4892f, 9.0933f, 7.4644f, 8.889f, 8.5542f)
                curveTo(8.7281f, 9.4124f, 8.6282f, 10.3222f, 8.5932f, 11.25f)
                horizontalLineTo(15.4071f)
                curveTo(15.372f, 10.3222f, 15.2722f, 9.4124f, 15.1113f, 8.5542f)
                curveTo(14.907f, 7.4644f, 14.6101f, 6.4892f, 14.2444f, 5.6814f)
                curveTo(13.8763f, 4.8682f, 13.4597f, 4.2713f, 13.0435f, 3.8904f)
                curveTo(12.6304f, 3.5124f, 12.2751f, 3.3953f, 12.0001f, 3.3953f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.889f, 15.4458f)
                curveTo(9.0933f, 16.5356f, 9.3902f, 17.5108f, 9.7558f, 18.3186f)
                curveTo(10.1239f, 19.1319f, 10.5406f, 19.7287f, 10.9567f, 20.1096f)
                curveTo(11.3698f, 20.4876f, 11.7251f, 20.6047f, 12.0001f, 20.6047f)
                curveTo(12.2751f, 20.6047f, 12.6304f, 20.4876f, 13.0435f, 20.1096f)
                curveTo(13.4597f, 19.7287f, 13.8763f, 19.1319f, 14.2444f, 18.3186f)
                curveTo(14.6101f, 17.5108f, 14.907f, 16.5356f, 15.1113f, 15.4458f)
                curveTo(15.2722f, 14.5876f, 15.372f, 13.6778f, 15.4071f, 12.75f)
                horizontalLineTo(8.5932f)
                curveTo(8.6282f, 13.6778f, 8.7281f, 14.5876f, 8.889f, 15.4458f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0001f, 2.0f)
                curveTo(12.831f, 2.0f, 13.5708f, 2.3642f, 14.1793f, 2.9211f)
                curveTo(14.7849f, 3.4753f, 15.2966f, 4.2488f, 15.7104f, 5.1631f)
                curveTo(16.1267f, 6.0829f, 16.4501f, 7.1587f, 16.669f, 8.3261f)
                curveTo(16.8445f, 9.2619f, 16.9512f, 10.2485f, 16.9868f, 11.25f)
                horizontalLineTo(21.9724f)
                curveTo(21.5889f, 6.0774f, 17.2707f, 2.0f, 12.0001f, 2.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.669f, 15.6739f)
                curveTo(16.4501f, 16.8413f, 16.1267f, 17.9171f, 15.7104f, 18.8368f)
                curveTo(15.2966f, 19.7512f, 14.7849f, 20.5247f, 14.1793f, 21.0789f)
                curveTo(13.5708f, 21.6358f, 12.831f, 22.0f, 12.0001f, 22.0f)
                curveTo(17.2707f, 22.0f, 21.5889f, 17.9226f, 21.9724f, 12.75f)
                horizontalLineTo(16.9868f)
                curveTo(16.9512f, 13.7515f, 16.8445f, 14.7381f, 16.669f, 15.6739f)
                close()
            }
        }
            .build()
        return _global!!
    }

private var _global: ImageVector? = null
