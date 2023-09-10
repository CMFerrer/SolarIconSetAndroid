package com.chiksmedina.solar.boldduotone.designtools

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
import com.chiksmedina.solar.boldduotone.DesignToolsGroup

val DesignToolsGroup.AlignTop: ImageVector
    get() {
        if (_alignTop != null) {
            return _alignTop!!
        }
        _alignTop = Builder(
            name = "AlignTop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.5f, 7.75f)
                curveTo(6.5654f, 7.75f, 6.0981f, 7.75f, 5.75f, 7.951f)
                curveTo(5.522f, 8.0826f, 5.3326f, 8.272f, 5.201f, 8.5f)
                curveTo(5.0f, 8.8481f, 5.0f, 9.3154f, 5.0f, 10.25f)
                lineTo(5.0f, 19.25f)
                curveTo(5.0f, 20.1846f, 5.0f, 20.6519f, 5.201f, 21.0f)
                curveTo(5.3326f, 21.228f, 5.522f, 21.4174f, 5.75f, 21.549f)
                curveTo(6.0981f, 21.75f, 6.5654f, 21.75f, 7.5f, 21.75f)
                curveTo(8.4346f, 21.75f, 8.9019f, 21.75f, 9.25f, 21.549f)
                curveTo(9.478f, 21.4174f, 9.6674f, 21.228f, 9.799f, 21.0f)
                curveTo(10.0f, 20.6519f, 10.0f, 20.1846f, 10.0f, 19.25f)
                verticalLineTo(10.25f)
                curveTo(10.0f, 9.3154f, 10.0f, 8.8481f, 9.799f, 8.5f)
                curveTo(9.6674f, 8.272f, 9.478f, 8.0826f, 9.25f, 7.951f)
                curveTo(8.9019f, 7.75f, 8.4346f, 7.75f, 7.5f, 7.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.5f, 7.75f)
                curveTo(15.5654f, 7.75f, 15.0981f, 7.75f, 14.75f, 7.951f)
                curveTo(14.522f, 8.0826f, 14.3326f, 8.272f, 14.201f, 8.5f)
                curveTo(14.0f, 8.8481f, 14.0f, 9.3154f, 14.0f, 10.25f)
                verticalLineTo(16.25f)
                curveTo(14.0f, 17.1846f, 14.0f, 17.6519f, 14.201f, 18.0f)
                curveTo(14.3326f, 18.228f, 14.522f, 18.4174f, 14.75f, 18.549f)
                curveTo(15.0981f, 18.75f, 15.5654f, 18.75f, 16.5f, 18.75f)
                curveTo(17.4346f, 18.75f, 17.9019f, 18.75f, 18.25f, 18.549f)
                curveTo(18.478f, 18.4174f, 18.6674f, 18.228f, 18.799f, 18.0f)
                curveTo(19.0f, 17.6519f, 19.0f, 17.1846f, 19.0f, 16.25f)
                verticalLineTo(10.25f)
                curveTo(19.0f, 9.3154f, 19.0f, 8.8481f, 18.799f, 8.5f)
                curveTo(18.6674f, 8.272f, 18.478f, 8.0826f, 18.25f, 7.951f)
                curveTo(17.9019f, 7.75f, 17.4346f, 7.75f, 16.5f, 7.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(22.75f, 3.75f)
                curveTo(22.75f, 4.1642f, 22.4142f, 4.5f, 22.0f, 4.5f)
                lineTo(2.0f, 4.5f)
                curveTo(1.5858f, 4.5f, 1.25f, 4.1642f, 1.25f, 3.75f)
                curveTo(1.25f, 3.3358f, 1.5858f, 3.0f, 2.0f, 3.0f)
                lineTo(22.0f, 3.0f)
                curveTo(22.4142f, 3.0f, 22.75f, 3.3358f, 22.75f, 3.75f)
                close()
            }
        }
            .build()
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
