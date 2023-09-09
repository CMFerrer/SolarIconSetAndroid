package com.chiksmedina.solar.broken.astronomy

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.AstronomyGroup

public val AstronomyGroup.StarFallMinimalistic2: ImageVector
    get() {
        if (_starFallMinimalistic2 != null) {
            return _starFallMinimalistic2!!
        }
        _starFallMinimalistic2 = Builder(name = "StarFallMinimalistic2", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.2316f, 8.6176f)
                curveTo(7.2639f, 9.0628f, 6.28f, 9.2854f, 6.0459f, 10.0382f)
                curveTo(5.8119f, 10.7909f, 6.4826f, 11.5753f, 7.8241f, 13.1439f)
                lineTo(8.1711f, 13.5498f)
                curveTo(8.5523f, 13.9955f, 8.7429f, 14.2184f, 8.8287f, 14.4942f)
                curveTo(8.9144f, 14.7699f, 8.8856f, 15.0673f, 8.828f, 15.662f)
                lineTo(8.7755f, 16.2035f)
                curveTo(8.5727f, 18.2965f, 8.4713f, 19.343f, 9.0841f, 19.8082f)
                curveTo(9.6969f, 20.2734f, 10.6181f, 19.8492f, 12.4605f, 19.0009f)
                lineTo(12.9372f, 18.7815f)
                curveTo(13.4607f, 18.5404f, 13.7225f, 18.4199f, 14.0f, 18.4199f)
                curveTo(14.2775f, 18.4199f, 14.5393f, 18.5404f, 15.0628f, 18.7815f)
                lineTo(15.5395f, 19.0009f)
                curveTo(17.3819f, 19.8492f, 18.3031f, 20.2734f, 18.9159f, 19.8082f)
                curveTo(19.5287f, 19.343f, 19.4273f, 18.2965f, 19.2245f, 16.2035f)
                moveTo(20.1759f, 13.1439f)
                curveTo(21.5174f, 11.5753f, 22.1881f, 10.7909f, 21.9541f, 10.0382f)
                curveTo(21.72f, 9.2854f, 20.7361f, 9.0628f, 18.7684f, 8.6176f)
                lineTo(18.2593f, 8.5024f)
                curveTo(17.7001f, 8.3759f, 17.4205f, 8.3127f, 17.196f, 8.1423f)
                curveTo(16.9716f, 7.9718f, 16.8276f, 7.7136f, 16.5396f, 7.197f)
                lineTo(16.2775f, 6.7267f)
                curveTo(15.2641f, 4.9089f, 14.7575f, 4.0f, 14.0f, 4.0f)
                curveTo(13.2425f, 4.0f, 12.7359f, 4.9089f, 11.7225f, 6.7267f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0889f, 16.0f)
                curveTo(3.2044f, 15.121f, 4.6864f, 14.7971f, 6.0889f, 15.1257f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0889f, 10.5f)
                curveTo(3.0889f, 10.0f, 3.3786f, 10.0605f, 4.0889f, 10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 5.6087f)
                lineTo(2.2082f, 5.4868f)
                curveTo(4.4138f, 4.1951f, 6.7503f, 3.8469f, 8.953f, 4.4816f)
                lineTo(9.1609f, 4.5415f)
            }
        }
        .build()
        return _starFallMinimalistic2!!
    }

private var _starFallMinimalistic2: ImageVector? = null
