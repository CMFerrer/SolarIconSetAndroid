package com.chiksmedina.solar.boldduotone.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.ArrowsGroup

public val ArrowsGroup.SortVertical: ImageVector
    get() {
        if (_sortVertical != null) {
            return _sortVertical!!
        }
        _sortVertical = Builder(name = "SortVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.875f)
                curveTo(20.3013f, 10.875f, 20.5733f, 10.6948f, 20.6907f, 10.4173f)
                curveTo(20.8081f, 10.1399f, 20.7482f, 9.8192f, 20.5384f, 9.6029f)
                lineTo(16.5384f, 5.4779f)
                curveTo(16.3972f, 5.3322f, 16.2029f, 5.25f, 16.0f, 5.25f)
                curveTo(15.7971f, 5.25f, 15.6029f, 5.3322f, 15.4616f, 5.4779f)
                lineTo(11.4616f, 9.6029f)
                curveTo(11.2519f, 9.8192f, 11.1919f, 10.1399f, 11.3093f, 10.4173f)
                curveTo(11.4268f, 10.6948f, 11.6988f, 10.875f, 12.0f, 10.875f)
                horizontalLineTo(15.25f)
                verticalLineTo(18.0f)
                curveTo(15.25f, 18.4142f, 15.5858f, 18.75f, 16.0f, 18.75f)
                curveTo(16.4142f, 18.75f, 16.75f, 18.4142f, 16.75f, 18.0f)
                lineTo(16.75f, 10.875f)
                horizontalLineTo(20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 13.125f)
                curveTo(12.3013f, 13.125f, 12.5733f, 13.3052f, 12.6907f, 13.5827f)
                curveTo(12.8081f, 13.8601f, 12.7482f, 14.1808f, 12.5384f, 14.3971f)
                lineTo(8.5384f, 18.5221f)
                curveTo(8.3972f, 18.6678f, 8.2029f, 18.75f, 8.0f, 18.75f)
                curveTo(7.7971f, 18.75f, 7.6028f, 18.6678f, 7.4616f, 18.5221f)
                lineTo(3.4616f, 14.3971f)
                curveTo(3.2519f, 14.1808f, 3.1919f, 13.8601f, 3.3093f, 13.5827f)
                curveTo(3.4268f, 13.3052f, 3.6988f, 13.125f, 4.0f, 13.125f)
                horizontalLineTo(7.25f)
                lineTo(7.25f, 6.0f)
                curveTo(7.25f, 5.5858f, 7.5858f, 5.25f, 8.0f, 5.25f)
                curveTo(8.4142f, 5.25f, 8.75f, 5.5858f, 8.75f, 6.0f)
                lineTo(8.75f, 13.125f)
                lineTo(12.0f, 13.125f)
                close()
            }
        }
        .build()
        return _sortVertical!!
    }

private var _sortVertical: ImageVector? = null
