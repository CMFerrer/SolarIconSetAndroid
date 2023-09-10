package com.chiksmedina.solar.boldduotone.maplocation

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
import com.chiksmedina.solar.boldduotone.MapLocationGroup

val MapLocationGroup.Routing3: ImageVector
    get() {
        if (_routing3 != null) {
            return _routing3!!
        }
        _routing3 = Builder(
            name = "Routing3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 5.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 19.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.2501f, 5.0f)
                curveTo(10.2501f, 4.5858f, 10.5859f, 4.25f, 11.0001f, 4.25f)
                horizontalLineTo(16.132f)
                curveTo(18.8832f, 4.25f, 19.9295f, 7.843f, 17.6084f, 9.3201f)
                lineTo(7.1971f, 15.9454f)
                curveTo(6.1421f, 16.6168f, 6.6177f, 18.25f, 7.8682f, 18.25f)
                horizontalLineTo(11.1894f)
                lineTo(10.9698f, 18.0303f)
                curveTo(10.6769f, 17.7374f, 10.6769f, 17.2626f, 10.9698f, 16.9697f)
                curveTo(11.2627f, 16.6768f, 11.7375f, 16.6768f, 12.0304f, 16.9697f)
                lineTo(13.5304f, 18.4697f)
                curveTo(13.8233f, 18.7626f, 13.8233f, 19.2374f, 13.5304f, 19.5303f)
                lineTo(12.0304f, 21.0303f)
                curveTo(11.7375f, 21.3232f, 11.2627f, 21.3232f, 10.9698f, 21.0303f)
                curveTo(10.6769f, 20.7374f, 10.6769f, 20.2626f, 10.9698f, 19.9697f)
                lineTo(11.1894f, 19.75f)
                horizontalLineTo(7.8682f)
                curveTo(5.117f, 19.75f, 4.0707f, 16.157f, 6.3918f, 14.6799f)
                lineTo(16.8031f, 8.0546f)
                curveTo(17.8581f, 7.3832f, 17.3825f, 5.75f, 16.132f, 5.75f)
                horizontalLineTo(11.0001f)
                curveTo(10.5859f, 5.75f, 10.2501f, 5.4142f, 10.2501f, 5.0f)
                close()
            }
        }
            .build()
        return _routing3!!
    }

private var _routing3: ImageVector? = null
