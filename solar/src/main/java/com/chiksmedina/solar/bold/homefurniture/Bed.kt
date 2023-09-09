package com.chiksmedina.solar.bold.homefurniture

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.HomeFurnitureGroup

public val HomeFurnitureGroup.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(name = "Bed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 10.5f)
                verticalLineTo(7.25f)
                horizontalLineTo(9.5f)
                curveTo(8.536f, 7.25f, 7.8885f, 7.2516f, 7.4054f, 7.3165f)
                curveTo(6.944f, 7.3786f, 6.7465f, 7.4858f, 6.6161f, 7.6161f)
                curveTo(6.4858f, 7.7464f, 6.3786f, 7.9439f, 6.3166f, 8.4054f)
                curveTo(6.2516f, 8.8884f, 6.25f, 9.536f, 6.25f, 10.5f)
                lineTo(11.25f, 10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 10.5f)
                curveTo(17.75f, 9.536f, 17.7484f, 8.8884f, 17.6835f, 8.4054f)
                curveTo(17.6215f, 7.9439f, 17.5142f, 7.7464f, 17.3839f, 7.6161f)
                curveTo(17.2536f, 7.4858f, 17.0561f, 7.3786f, 16.5946f, 7.3165f)
                curveTo(16.1116f, 7.2516f, 15.464f, 7.25f, 14.5f, 7.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(10.5f)
                lineTo(17.75f, 10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 4.0f)
                horizontalLineTo(11.0f)
                curveTo(7.2288f, 4.0f, 5.3432f, 4.0f, 4.1716f, 5.1716f)
                curveTo(3.1491f, 6.194f, 3.019f, 7.7604f, 3.0024f, 10.6494f)
                verticalLineTo(12.2665f)
                curveTo(2.6221f, 12.4854f, 2.322f, 12.8248f, 2.1522f, 13.2346f)
                curveTo(2.0f, 13.6022f, 2.0f, 14.0681f, 2.0f, 15.0f)
                curveTo(2.0f, 15.9319f, 2.0f, 16.3978f, 2.1522f, 16.7654f)
                curveTo(2.3552f, 17.2554f, 2.7446f, 17.6448f, 3.2346f, 17.8478f)
                curveTo(3.487f, 17.9523f, 3.7858f, 17.9851f, 4.25f, 17.9953f)
                verticalLineTo(20.0f)
                curveTo(4.25f, 20.4142f, 4.5858f, 20.75f, 5.0f, 20.75f)
                curveTo(5.4142f, 20.75f, 5.75f, 20.4142f, 5.75f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.25f)
                verticalLineTo(20.0f)
                curveTo(18.25f, 20.4142f, 18.5858f, 20.75f, 19.0f, 20.75f)
                curveTo(19.4142f, 20.75f, 19.75f, 20.4142f, 19.75f, 20.0f)
                verticalLineTo(17.9953f)
                curveTo(20.2142f, 17.9851f, 20.513f, 17.9523f, 20.7654f, 17.8478f)
                curveTo(21.2554f, 17.6448f, 21.6448f, 17.2554f, 21.8478f, 16.7654f)
                curveTo(22.0f, 16.3978f, 22.0f, 15.9319f, 22.0f, 15.0f)
                curveTo(22.0f, 14.0681f, 22.0f, 13.6022f, 21.8478f, 13.2346f)
                curveTo(21.678f, 12.8248f, 21.3779f, 12.4854f, 20.9976f, 12.2666f)
                verticalLineTo(10.6494f)
                curveTo(20.9811f, 7.7604f, 20.8509f, 6.194f, 19.8285f, 5.1716f)
                curveTo(18.6569f, 4.0f, 16.7713f, 4.0f, 13.0f, 4.0f)
                close()
                moveTo(19.25f, 12.0001f)
                verticalLineTo(10.448f)
                curveTo(19.2501f, 9.5496f, 19.2501f, 8.8003f, 19.1701f, 8.2055f)
                curveTo(19.0857f, 7.5777f, 18.9f, 7.0109f, 18.4446f, 6.5555f)
                curveTo(17.9891f, 6.1f, 17.4223f, 5.9143f, 16.7945f, 5.8299f)
                curveTo(16.1997f, 5.7499f, 15.4505f, 5.75f, 14.552f, 5.75f)
                horizontalLineTo(9.448f)
                curveTo(8.5496f, 5.75f, 7.8003f, 5.7499f, 7.2056f, 5.8299f)
                curveTo(6.5778f, 5.9143f, 6.011f, 6.1f, 5.5555f, 6.5555f)
                curveTo(5.1f, 7.0109f, 4.9143f, 7.5777f, 4.8299f, 8.2055f)
                curveTo(4.75f, 8.8003f, 4.75f, 9.5495f, 4.75f, 10.448f)
                verticalLineTo(12.0001f)
                curveTo(4.8295f, 12.0f, 4.9127f, 12.0f, 5.0f, 12.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0873f, 12.0f, 19.1706f, 12.0f, 19.25f, 12.0001f)
                close()
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
