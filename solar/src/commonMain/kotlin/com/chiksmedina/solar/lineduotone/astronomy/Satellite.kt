package com.chiksmedina.solar.lineduotone.astronomy

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
import com.chiksmedina.solar.lineduotone.AstronomyGroup

val AstronomyGroup.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(
            name = "Satellite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF8E93A6)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.47f, 10.9182f)
                curveTo(20.47f, 10.9182f, 18.6229f, 10.3027f, 16.1603f, 7.8401f)
                curveTo(13.6976f, 5.3775f, 13.082f, 3.5303f, 13.082f, 3.5303f)
            }
            path(
                fill = SolidColor(Color(0xFF8E93A6)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.6905f, 8.3704f)
                curveTo(16.9834f, 8.0775f, 16.9834f, 7.6027f, 16.6905f, 7.3098f)
                curveTo(16.3977f, 7.0169f, 15.9228f, 7.0169f, 15.6299f, 7.3098f)
                lineTo(16.6905f, 8.3704f)
                close()
                moveTo(1.6358f, 9.0315f)
                curveTo(1.2737f, 9.2326f, 1.1432f, 9.6892f, 1.3444f, 10.0513f)
                curveTo(1.5455f, 10.4134f, 2.0022f, 10.5438f, 2.3642f, 10.3427f)
                lineTo(1.6358f, 9.0315f)
                close()
                moveTo(13.6576f, 21.636f)
                curveTo(13.4565f, 21.9981f, 13.5869f, 22.4547f, 13.949f, 22.6558f)
                curveTo(14.3111f, 22.857f, 14.7677f, 22.7265f, 14.9688f, 22.3644f)
                lineTo(13.6576f, 21.636f)
                close()
                moveTo(4.4697f, 18.4699f)
                curveTo(4.1768f, 18.7628f, 4.1768f, 19.2376f, 4.4697f, 19.5305f)
                curveTo(4.7626f, 19.8234f, 5.2374f, 19.8234f, 5.5303f, 19.5305f)
                lineTo(4.4697f, 18.4699f)
                close()
                moveTo(12.7177f, 2.8747f)
                lineTo(1.6358f, 9.0315f)
                lineTo(2.3642f, 10.3427f)
                lineTo(13.4462f, 4.1859f)
                lineTo(12.7177f, 2.8747f)
                close()
                moveTo(19.8143f, 10.5539f)
                lineTo(13.6576f, 21.636f)
                lineTo(14.9688f, 22.3644f)
                lineTo(21.1255f, 11.2824f)
                lineTo(19.8143f, 10.5539f)
                close()
                moveTo(15.6299f, 7.3098f)
                lineTo(4.4697f, 18.4699f)
                lineTo(5.5303f, 19.5305f)
                lineTo(16.6905f, 8.3704f)
                lineTo(15.6299f, 7.3098f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(13.0818f, 10.918f)
                curveTo(15.122f, 12.9581f, 18.4297f, 12.9581f, 20.4698f, 10.918f)
                curveTo(22.5099f, 8.8778f, 22.5099f, 5.5702f, 20.4698f, 3.5301f)
                curveTo(18.4297f, 1.49f, 15.122f, 1.49f, 13.0818f, 3.5301f)
                curveTo(11.0417f, 5.5702f, 11.0417f, 8.8778f, 13.0818f, 10.918f)
                close()
            }
        }
            .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null
