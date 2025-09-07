package com.chiksmedina.solar.bold.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.ArrowsGroup

val ArrowsGroup.SortHorizontal: ImageVector
    get() {
        if (_sortHorizontal != null) {
            return _sortHorizontal!!
        }
        _sortHorizontal = Builder(
            name = "SortHorizontal", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.125f, 12.0f)
                curveTo(13.125f, 11.6988f, 13.3052f, 11.4268f, 13.5827f, 11.3093f)
                curveTo(13.8601f, 11.1919f, 14.1808f, 11.2519f, 14.3971f, 11.4616f)
                lineTo(18.5221f, 15.4616f)
                curveTo(18.6678f, 15.6029f, 18.75f, 15.7971f, 18.75f, 16.0f)
                curveTo(18.75f, 16.2029f, 18.6678f, 16.3972f, 18.5221f, 16.5384f)
                lineTo(14.3971f, 20.5384f)
                curveTo(14.1808f, 20.7482f, 13.8601f, 20.8081f, 13.5827f, 20.6907f)
                curveTo(13.3052f, 20.5733f, 13.125f, 20.3013f, 13.125f, 20.0f)
                verticalLineTo(16.75f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 16.75f, 5.25f, 16.4142f, 5.25f, 16.0f)
                curveTo(5.25f, 15.5858f, 5.5858f, 15.25f, 6.0f, 15.25f)
                lineTo(13.125f, 15.25f)
                lineTo(13.125f, 12.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.875f, 4.0f)
                curveTo(10.875f, 3.6988f, 10.6948f, 3.4268f, 10.4173f, 3.3093f)
                curveTo(10.1399f, 3.1919f, 9.8192f, 3.2519f, 9.6029f, 3.4616f)
                lineTo(5.4779f, 7.4616f)
                curveTo(5.3322f, 7.6028f, 5.25f, 7.7971f, 5.25f, 8.0f)
                curveTo(5.25f, 8.2029f, 5.3322f, 8.3972f, 5.4779f, 8.5384f)
                lineTo(9.6029f, 12.5384f)
                curveTo(9.8192f, 12.7482f, 10.1399f, 12.8081f, 10.4173f, 12.6907f)
                curveTo(10.6948f, 12.5733f, 10.875f, 12.3013f, 10.875f, 12.0f)
                verticalLineTo(8.75f)
                lineTo(18.0f, 8.75f)
                curveTo(18.4142f, 8.75f, 18.75f, 8.4142f, 18.75f, 8.0f)
                curveTo(18.75f, 7.5858f, 18.4142f, 7.25f, 18.0f, 7.25f)
                lineTo(10.875f, 7.25f)
                verticalLineTo(4.0f)
                close()
            }
        }
            .build()
        return _sortHorizontal!!
    }

private var _sortHorizontal: ImageVector? = null
