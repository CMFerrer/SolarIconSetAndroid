package com.chiksmedina.solar.linear.arrowsaction

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.ArrowsActionGroup

val ArrowsActionGroup.Reorder: ImageVector
    get() {
        if (_reorder != null) {
            return _reorder!!
        }
        _reorder = Builder(
            name = "Reorder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 17.5f)
                curveTo(2.0f, 16.5654f, 2.0f, 16.0981f, 2.201f, 15.75f)
                curveTo(2.3326f, 15.522f, 2.522f, 15.3326f, 2.75f, 15.201f)
                curveTo(3.0981f, 15.0f, 3.5654f, 15.0f, 4.5f, 15.0f)
                curveTo(5.4346f, 15.0f, 5.9019f, 15.0f, 6.25f, 15.201f)
                curveTo(6.478f, 15.3326f, 6.6674f, 15.522f, 6.799f, 15.75f)
                curveTo(7.0f, 16.0981f, 7.0f, 16.5654f, 7.0f, 17.5f)
                curveTo(7.0f, 18.4346f, 7.0f, 18.9019f, 6.799f, 19.25f)
                curveTo(6.6674f, 19.478f, 6.478f, 19.6674f, 6.25f, 19.799f)
                curveTo(5.9019f, 20.0f, 5.4346f, 20.0f, 4.5f, 20.0f)
                curveTo(3.5654f, 20.0f, 3.0981f, 20.0f, 2.75f, 19.799f)
                curveTo(2.522f, 19.6674f, 2.3326f, 19.478f, 2.201f, 19.25f)
                curveTo(2.0f, 18.9019f, 2.0f, 18.4346f, 2.0f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(9.5f, 17.5f)
                curveTo(9.5f, 16.5654f, 9.5f, 16.0981f, 9.701f, 15.75f)
                curveTo(9.8326f, 15.522f, 10.022f, 15.3326f, 10.25f, 15.201f)
                curveTo(10.5981f, 15.0f, 11.0654f, 15.0f, 12.0f, 15.0f)
                curveTo(12.9346f, 15.0f, 13.4019f, 15.0f, 13.75f, 15.201f)
                curveTo(13.978f, 15.3326f, 14.1674f, 15.522f, 14.299f, 15.75f)
                curveTo(14.5f, 16.0981f, 14.5f, 16.5654f, 14.5f, 17.5f)
                curveTo(14.5f, 18.4346f, 14.5f, 18.9019f, 14.299f, 19.25f)
                curveTo(14.1674f, 19.478f, 13.978f, 19.6674f, 13.75f, 19.799f)
                curveTo(13.4019f, 20.0f, 12.9346f, 20.0f, 12.0f, 20.0f)
                curveTo(11.0654f, 20.0f, 10.5981f, 20.0f, 10.25f, 19.799f)
                curveTo(10.022f, 19.6674f, 9.8326f, 19.478f, 9.701f, 19.25f)
                curveTo(9.5f, 18.9019f, 9.5f, 18.4346f, 9.5f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(17.0f, 17.5f)
                curveTo(17.0f, 16.5654f, 17.0f, 16.0981f, 17.201f, 15.75f)
                curveTo(17.3326f, 15.522f, 17.522f, 15.3326f, 17.75f, 15.201f)
                curveTo(18.0981f, 15.0f, 18.5654f, 15.0f, 19.5f, 15.0f)
                curveTo(20.4346f, 15.0f, 20.9019f, 15.0f, 21.25f, 15.201f)
                curveTo(21.478f, 15.3326f, 21.6674f, 15.522f, 21.799f, 15.75f)
                curveTo(22.0f, 16.0981f, 22.0f, 16.5654f, 22.0f, 17.5f)
                curveTo(22.0f, 18.4346f, 22.0f, 18.9019f, 21.799f, 19.25f)
                curveTo(21.6674f, 19.478f, 21.478f, 19.6674f, 21.25f, 19.799f)
                curveTo(20.9019f, 20.0f, 20.4346f, 20.0f, 19.5f, 20.0f)
                curveTo(18.5654f, 20.0f, 18.0981f, 20.0f, 17.75f, 19.799f)
                curveTo(17.522f, 19.6674f, 17.3326f, 19.478f, 17.201f, 19.25f)
                curveTo(17.0f, 18.9019f, 17.0f, 18.4346f, 17.0f, 17.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.5f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(4.5f, 6.643f, 4.5f, 5.4645f, 5.2322f, 4.7322f)
                curveTo(5.9645f, 4.0f, 7.143f, 4.0f, 9.5f, 4.0f)
                horizontalLineTo(14.5f)
                curveTo(16.857f, 4.0f, 18.0355f, 4.0f, 18.7678f, 4.7322f)
                curveTo(19.5f, 5.4645f, 19.5f, 6.643f, 19.5f, 9.0f)
                verticalLineTo(12.0f)
                moveTo(19.5f, 12.0f)
                lineTo(21.5f, 10.0f)
                moveTo(19.5f, 12.0f)
                lineTo(17.5f, 10.0f)
            }
        }
            .build()
        return _reorder!!
    }

private var _reorder: ImageVector? = null
