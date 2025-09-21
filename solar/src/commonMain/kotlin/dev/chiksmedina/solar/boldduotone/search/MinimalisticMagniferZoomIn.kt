package dev.chiksmedina.solar.boldduotone.search

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
import dev.chiksmedina.solar.boldduotone.SearchGroup

val SearchGroup.MinimalisticMagniferZoomIn: ImageVector
    get() {
        if (_minimalisticMagniferZoomIn != null) {
            return _minimalisticMagniferZoomIn!!
        }
        _minimalisticMagniferZoomIn = Builder(
            name = "MinimalisticMagniferZoomIn", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.1566f, 20.3133f)
                curveTo(16.2137f, 20.3133f, 20.3133f, 16.2137f, 20.3133f, 11.1566f)
                curveTo(20.3133f, 6.0996f, 16.2137f, 2.0f, 11.1566f, 2.0f)
                curveTo(6.0996f, 2.0f, 2.0f, 6.0996f, 2.0f, 11.1566f)
                curveTo(2.0f, 16.2137f, 6.0996f, 20.3133f, 11.1566f, 20.3133f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.1565f, 8.0244f)
                curveTo(11.5557f, 8.0244f, 11.8793f, 8.3481f, 11.8793f, 8.7473f)
                verticalLineTo(10.4341f)
                horizontalLineTo(13.5661f)
                curveTo(13.9653f, 10.4341f, 14.289f, 10.7577f, 14.289f, 11.1569f)
                curveTo(14.289f, 11.5562f, 13.9653f, 11.8798f, 13.5661f, 11.8798f)
                horizontalLineTo(11.8793f)
                verticalLineTo(13.5666f)
                curveTo(11.8793f, 13.9658f, 11.5557f, 14.2895f, 11.1565f, 14.2895f)
                curveTo(10.7572f, 14.2895f, 10.4336f, 13.9658f, 10.4336f, 13.5666f)
                verticalLineTo(11.8798f)
                horizontalLineTo(8.7468f)
                curveTo(8.3476f, 11.8798f, 8.0239f, 11.5562f, 8.0239f, 11.1569f)
                curveTo(8.0239f, 10.7577f, 8.3476f, 10.4341f, 8.7468f, 10.4341f)
                horizontalLineTo(10.4336f)
                verticalLineTo(8.7473f)
                curveTo(10.4336f, 8.3481f, 10.7572f, 8.0244f, 11.1565f, 8.0244f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(18.8387f, 18.8387f)
                curveTo(19.121f, 18.5564f, 19.5787f, 18.5564f, 19.861f, 18.8387f)
                lineTo(21.7887f, 20.7664f)
                curveTo(22.071f, 21.0487f, 22.071f, 21.5064f, 21.7887f, 21.7887f)
                curveTo(21.5064f, 22.071f, 21.0487f, 22.071f, 20.7664f, 21.7887f)
                lineTo(18.8387f, 19.861f)
                curveTo(18.5564f, 19.5787f, 18.5564f, 19.121f, 18.8387f, 18.8387f)
                close()
            }
        }
            .build()
        return _minimalisticMagniferZoomIn!!
    }

private var _minimalisticMagniferZoomIn: ImageVector? = null
