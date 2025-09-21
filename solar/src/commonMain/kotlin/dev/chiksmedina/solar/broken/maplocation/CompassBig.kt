package dev.chiksmedina.solar.broken.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.broken.MapLocationGroup

val MapLocationGroup.CompassBig: ImageVector
    get() {
        if (_compassBig != null) {
            return _compassBig!!
        }
        _compassBig = Builder(
            name = "CompassBig", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0254f, 9.2102f)
                curveTo(5.5623f, 7.868f, 5.8307f, 7.1969f, 6.2924f, 6.6705f)
                curveTo(6.41f, 6.5363f, 6.5363f, 6.41f, 6.6705f, 6.2924f)
                curveTo(7.1969f, 5.8307f, 7.868f, 5.5623f, 9.2102f, 5.0254f)
                curveTo(15.5025f, 2.5085f, 18.6487f, 1.25f, 20.4457f, 2.4712f)
                curveTo(20.8718f, 2.7607f, 21.2393f, 3.1282f, 21.5288f, 3.5543f)
                curveTo(22.4801f, 4.9542f, 21.9267f, 7.1728f, 20.4457f, 11.0596f)
                curveTo(20.0256f, 12.1623f, 19.5308f, 13.3992f, 18.9746f, 14.7898f)
                curveTo(18.4377f, 16.132f, 18.1693f, 16.8031f, 17.7076f, 17.3295f)
                curveTo(17.59f, 17.4637f, 17.4637f, 17.59f, 17.3295f, 17.7076f)
                curveTo(16.8031f, 18.1693f, 16.132f, 18.4377f, 14.7898f, 18.9746f)
                curveTo(8.4975f, 21.4915f, 5.3513f, 22.75f, 3.5543f, 21.5288f)
                curveTo(3.1282f, 21.2393f, 2.7607f, 20.8718f, 2.4712f, 20.4457f)
                curveTo(1.5248f, 19.053f, 2.0677f, 16.8499f, 3.5316f, 13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.5f, 14.9585f)
                curveTo(12.3374f, 14.9858f, 12.1704f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3431f, 15.0f, 9.0f, 13.6569f, 9.0f, 12.0f)
                curveTo(9.0f, 10.3431f, 10.3431f, 9.0f, 12.0f, 9.0f)
                curveTo(13.6569f, 9.0f, 15.0f, 10.3431f, 15.0f, 12.0f)
                curveTo(15.0f, 12.1704f, 14.9858f, 12.3374f, 14.9585f, 12.5f)
            }
        }
            .build()
        return _compassBig!!
    }

private var _compassBig: ImageVector? = null
