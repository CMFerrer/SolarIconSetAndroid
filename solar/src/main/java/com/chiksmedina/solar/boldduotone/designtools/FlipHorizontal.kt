package com.chiksmedina.solar.boldduotone.designtools

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
import com.chiksmedina.solar.boldduotone.DesignToolsGroup

public val DesignToolsGroup.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) {
            return _flipHorizontal!!
        }
        _flipHorizontal = Builder(name = "FlipHorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 5.8867f)
                verticalLineTo(18.1139f)
                curveTo(22.0f, 19.816f, 22.0f, 20.6671f, 21.4576f, 20.9463f)
                curveTo(20.9152f, 21.2254f, 20.2226f, 20.7307f, 18.8375f, 19.7414f)
                lineTo(17.2563f, 18.6119f)
                curveTo(16.6404f, 18.172f, 16.3325f, 17.9521f, 16.1663f, 17.629f)
                curveTo(16.0f, 17.306f, 16.0f, 16.9275f, 16.0f, 16.1707f)
                verticalLineTo(7.8298f)
                curveTo(16.0f, 7.073f, 16.0f, 6.6946f, 16.1662f, 6.3715f)
                curveTo(16.3325f, 6.0485f, 16.6404f, 5.8285f, 17.2563f, 5.3886f)
                lineTo(18.8375f, 4.2592f)
                curveTo(20.2226f, 3.2698f, 20.9152f, 2.7752f, 21.4576f, 3.0543f)
                curveTo(22.0f, 3.3334f, 22.0f, 4.1845f, 22.0f, 5.8867f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 5.8867f)
                lineTo(2.0f, 18.1139f)
                curveTo(2.0f, 19.816f, 2.0f, 20.6671f, 2.5424f, 20.9463f)
                curveTo(3.0848f, 21.2254f, 3.7774f, 20.7307f, 5.1625f, 19.7414f)
                lineTo(6.7437f, 18.6119f)
                curveTo(7.3596f, 18.172f, 7.6675f, 17.9521f, 7.8337f, 17.629f)
                curveTo(8.0f, 17.306f, 8.0f, 16.9275f, 8.0f, 16.1707f)
                lineTo(8.0f, 7.8298f)
                curveTo(8.0f, 7.073f, 8.0f, 6.6946f, 7.8337f, 6.3715f)
                curveTo(7.6675f, 6.0485f, 7.3596f, 5.8285f, 6.7437f, 5.3886f)
                lineTo(5.1625f, 4.2592f)
                curveTo(3.7774f, 3.2698f, 3.0848f, 2.7752f, 2.5424f, 3.0543f)
                curveTo(2.0f, 3.3334f, 2.0f, 4.1845f, 2.0f, 5.8867f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.75f)
                curveTo(11.5858f, 22.75f, 11.25f, 22.4142f, 11.25f, 22.0f)
                lineTo(11.25f, 18.0f)
                curveTo(11.25f, 17.5858f, 11.5858f, 17.25f, 12.0f, 17.25f)
                curveTo(12.4142f, 17.25f, 12.75f, 17.5858f, 12.75f, 18.0f)
                lineTo(12.75f, 22.0f)
                curveTo(12.75f, 22.4142f, 12.4142f, 22.75f, 12.0f, 22.75f)
                close()
                moveTo(12.0f, 14.75f)
                curveTo(11.5858f, 14.75f, 11.25f, 14.4142f, 11.25f, 14.0f)
                lineTo(11.25f, 10.0f)
                curveTo(11.25f, 9.5858f, 11.5858f, 9.25f, 12.0f, 9.25f)
                curveTo(12.4142f, 9.25f, 12.75f, 9.5858f, 12.75f, 10.0f)
                lineTo(12.75f, 14.0f)
                curveTo(12.75f, 14.4142f, 12.4142f, 14.75f, 12.0f, 14.75f)
                close()
                moveTo(12.0f, 6.75f)
                curveTo(11.5858f, 6.75f, 11.25f, 6.4142f, 11.25f, 6.0f)
                lineTo(11.25f, 2.0f)
                curveTo(11.25f, 1.5858f, 11.5858f, 1.25f, 12.0f, 1.25f)
                curveTo(12.4142f, 1.25f, 12.75f, 1.5858f, 12.75f, 2.0f)
                lineTo(12.75f, 6.0f)
                curveTo(12.75f, 6.4142f, 12.4142f, 6.75f, 12.0f, 6.75f)
                close()
            }
        }
        .build()
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
