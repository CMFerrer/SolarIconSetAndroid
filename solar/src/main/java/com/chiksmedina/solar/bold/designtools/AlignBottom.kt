package com.chiksmedina.solar.bold.designtools

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
import com.chiksmedina.solar.bold.DesignToolsGroup

val DesignToolsGroup.AlignBottom: ImageVector
    get() {
        if (_alignBottom != null) {
            return _alignBottom!!
        }
        _alignBottom = Builder(
            name = "AlignBottom", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(1.25f, 21.0f)
                curveTo(1.25f, 20.5858f, 1.5858f, 20.25f, 2.0f, 20.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 20.25f, 22.75f, 20.5858f, 22.75f, 21.0f)
                curveTo(22.75f, 21.4142f, 22.4142f, 21.75f, 22.0f, 21.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 21.75f, 1.25f, 21.4142f, 1.25f, 21.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.5f, 17.0f)
                curveTo(6.5654f, 17.0f, 6.0981f, 17.0f, 5.75f, 16.799f)
                curveTo(5.522f, 16.6674f, 5.3326f, 16.478f, 5.201f, 16.25f)
                curveTo(5.0f, 15.9019f, 5.0f, 15.4346f, 5.0f, 14.5f)
                lineTo(5.0f, 5.5f)
                curveTo(5.0f, 4.5654f, 5.0f, 4.0981f, 5.201f, 3.75f)
                curveTo(5.3326f, 3.522f, 5.522f, 3.3326f, 5.75f, 3.201f)
                curveTo(6.0981f, 3.0f, 6.5654f, 3.0f, 7.5f, 3.0f)
                curveTo(8.4346f, 3.0f, 8.9019f, 3.0f, 9.25f, 3.201f)
                curveTo(9.478f, 3.3326f, 9.6674f, 3.522f, 9.799f, 3.75f)
                curveTo(10.0f, 4.0981f, 10.0f, 4.5654f, 10.0f, 5.5f)
                verticalLineTo(14.5f)
                curveTo(10.0f, 15.4346f, 10.0f, 15.9019f, 9.799f, 16.25f)
                curveTo(9.6674f, 16.478f, 9.478f, 16.6674f, 9.25f, 16.799f)
                curveTo(8.9019f, 17.0f, 8.4346f, 17.0f, 7.5f, 17.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.5f, 17.0f)
                curveTo(15.5654f, 17.0f, 15.0981f, 17.0f, 14.75f, 16.799f)
                curveTo(14.522f, 16.6674f, 14.3326f, 16.478f, 14.201f, 16.25f)
                curveTo(14.0f, 15.9019f, 14.0f, 15.4346f, 14.0f, 14.5f)
                verticalLineTo(8.5f)
                curveTo(14.0f, 7.5654f, 14.0f, 7.0981f, 14.201f, 6.75f)
                curveTo(14.3326f, 6.522f, 14.522f, 6.3326f, 14.75f, 6.201f)
                curveTo(15.0981f, 6.0f, 15.5654f, 6.0f, 16.5f, 6.0f)
                curveTo(17.4346f, 6.0f, 17.9019f, 6.0f, 18.25f, 6.201f)
                curveTo(18.478f, 6.3326f, 18.6674f, 6.522f, 18.799f, 6.75f)
                curveTo(19.0f, 7.0981f, 19.0f, 7.5654f, 19.0f, 8.5f)
                verticalLineTo(14.5f)
                curveTo(19.0f, 15.4346f, 19.0f, 15.9019f, 18.799f, 16.25f)
                curveTo(18.6674f, 16.478f, 18.478f, 16.6674f, 18.25f, 16.799f)
                curveTo(17.9019f, 17.0f, 17.4346f, 17.0f, 16.5f, 17.0f)
                close()
            }
        }
            .build()
        return _alignBottom!!
    }

private var _alignBottom: ImageVector? = null
