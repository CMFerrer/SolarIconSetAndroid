package com.chiksmedina.solar.boldduotone.businessstatistic

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
import com.chiksmedina.solar.boldduotone.BusinessStatisticGroup

val BusinessStatisticGroup.CourseDown: ImageVector
    get() {
        if (_courseDown != null) {
            return _courseDown!!
        }
        _courseDown = Builder(
            name = "CourseDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.668f, 17.9999f)
                curveTo(15.668f, 18.4141f, 16.0038f, 18.7499f, 16.418f, 18.7499f)
                horizontalLineTo(22.0001f)
                curveTo(22.4143f, 18.7499f, 22.7501f, 18.4141f, 22.7501f, 17.9999f)
                verticalLineTo(12.4541f)
                curveTo(22.7501f, 12.0399f, 22.4143f, 11.7041f, 22.0001f, 11.7041f)
                curveTo(21.5859f, 11.7041f, 21.2501f, 12.0399f, 21.2501f, 12.4541f)
                verticalLineTo(17.2499f)
                horizontalLineTo(16.418f)
                curveTo(16.0038f, 17.2499f, 15.668f, 17.5857f, 15.668f, 17.9999f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(20.1873f, 17.25f)
                lineTo(14.0916f, 11.1973f)
                curveTo(13.5778f, 10.6866f, 13.2447f, 10.3577f, 12.9673f, 10.1473f)
                curveTo(12.7073f, 9.9501f, 12.5857f, 9.928f, 12.5052f, 9.928f)
                curveTo(12.4247f, 9.928f, 12.3031f, 9.9501f, 12.0431f, 10.1474f)
                curveTo(11.7658f, 10.3579f, 11.4327f, 10.6868f, 10.919f, 11.1976f)
                lineTo(10.6448f, 11.4704f)
                curveTo(10.1755f, 11.937f, 9.7711f, 12.3393f, 9.4038f, 12.618f)
                curveTo(9.01f, 12.9168f, 8.5725f, 13.1428f, 8.0339f, 13.1426f)
                curveTo(7.4953f, 13.1424f, 7.058f, 12.9161f, 6.6645f, 12.617f)
                curveTo(6.2974f, 12.338f, 5.8933f, 11.9355f, 5.4243f, 11.4685f)
                lineTo(1.4708f, 7.5314f)
                curveTo(1.1773f, 7.2392f, 1.1763f, 6.7643f, 1.4686f, 6.4708f)
                curveTo(1.7608f, 6.1773f, 2.2357f, 6.1763f, 2.5292f, 6.4686f)
                lineTo(6.4479f, 10.3708f)
                curveTo(6.9617f, 10.8825f, 7.2948f, 11.2119f, 7.5722f, 11.4228f)
                curveTo(7.8323f, 11.6205f, 7.9539f, 11.6426f, 8.0345f, 11.6426f)
                curveTo(8.1151f, 11.6427f, 8.2367f, 11.6206f, 8.497f, 11.4231f)
                curveTo(8.7745f, 11.2125f, 9.1079f, 10.8833f, 9.622f, 10.372f)
                lineTo(9.8963f, 10.0993f)
                curveTo(10.3651f, 9.633f, 10.7692f, 9.2312f, 11.1362f, 8.9526f)
                curveTo(11.5297f, 8.654f, 11.9668f, 8.4281f, 12.505f, 8.428f)
                curveTo(13.0432f, 8.428f, 13.4804f, 8.6538f, 13.8739f, 8.9523f)
                curveTo(14.241f, 9.2308f, 14.6452f, 9.6326f, 15.1142f, 10.0987f)
                lineTo(21.2501f, 16.1914f)
                verticalLineTo(17.25f)
                horizontalLineTo(20.1873f)
                close()
            }
        }
            .build()
        return _courseDown!!
    }

private var _courseDown: ImageVector? = null
