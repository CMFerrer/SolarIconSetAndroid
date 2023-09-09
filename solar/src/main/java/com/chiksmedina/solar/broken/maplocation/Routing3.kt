package com.chiksmedina.solar.broken.maplocation

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
import com.chiksmedina.solar.broken.MapLocationGroup

public val MapLocationGroup.Routing3: ImageVector
    get() {
        if (_routing3 != null) {
            return _routing3!!
        }
        _routing3 = Builder(name = "Routing3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 19.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.25f)
                curveTo(10.5858f, 4.25f, 10.25f, 4.5858f, 10.25f, 5.0f)
                curveTo(10.25f, 5.4142f, 10.5858f, 5.75f, 11.0f, 5.75f)
                verticalLineTo(4.25f)
                close()
                moveTo(13.0f, 19.0f)
                lineTo(13.5303f, 19.5303f)
                curveTo(13.8232f, 19.2374f, 13.8232f, 18.7626f, 13.5303f, 18.4697f)
                lineTo(13.0f, 19.0f)
                close()
                moveTo(17.2056f, 8.6873f)
                lineTo(17.6083f, 9.3201f)
                lineTo(17.6083f, 9.3201f)
                lineTo(17.2056f, 8.6873f)
                close()
                moveTo(6.7943f, 15.3127f)
                lineTo(7.197f, 15.9454f)
                lineTo(7.197f, 15.9454f)
                lineTo(6.7943f, 15.3127f)
                close()
                moveTo(12.0303f, 16.9697f)
                curveTo(11.7374f, 16.6768f, 11.2625f, 16.6768f, 10.9696f, 16.9697f)
                curveTo(10.6767f, 17.2626f, 10.6767f, 17.7374f, 10.9696f, 18.0303f)
                lineTo(12.0303f, 16.9697f)
                close()
                moveTo(10.9696f, 19.9697f)
                curveTo(10.6767f, 20.2626f, 10.6767f, 20.7374f, 10.9696f, 21.0303f)
                curveTo(11.2625f, 21.3232f, 11.7374f, 21.3232f, 12.0303f, 21.0303f)
                lineTo(10.9696f, 19.9697f)
                close()
                moveTo(10.4027f, 13.9055f)
                curveTo(10.7521f, 13.6831f, 10.8551f, 13.2195f, 10.6327f, 12.8701f)
                curveTo(10.4104f, 12.5206f, 9.9468f, 12.4176f, 9.5973f, 12.64f)
                lineTo(10.4027f, 13.9055f)
                close()
                moveTo(13.2001f, 10.3473f)
                curveTo(12.8507f, 10.5697f, 12.7477f, 11.0332f, 12.9701f, 11.3827f)
                curveTo(13.1924f, 11.7321f, 13.656f, 11.8351f, 14.0055f, 11.6128f)
                lineTo(13.2001f, 10.3473f)
                close()
                moveTo(16.1319f, 4.25f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.75f)
                horizontalLineTo(16.1319f)
                verticalLineTo(4.25f)
                close()
                moveTo(13.0f, 18.25f)
                horizontalLineTo(7.8681f)
                verticalLineTo(19.75f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.25f)
                close()
                moveTo(13.5303f, 18.4697f)
                lineTo(12.0303f, 16.9697f)
                lineTo(10.9696f, 18.0303f)
                lineTo(12.4696f, 19.5303f)
                lineTo(13.5303f, 18.4697f)
                close()
                moveTo(12.4696f, 18.4697f)
                lineTo(10.9696f, 19.9697f)
                lineTo(12.0303f, 21.0303f)
                lineTo(13.5303f, 19.5303f)
                lineTo(12.4696f, 18.4697f)
                close()
                moveTo(7.8681f, 18.25f)
                curveTo(6.6175f, 18.25f, 6.142f, 16.6168f, 7.197f, 15.9454f)
                lineTo(6.3917f, 14.6799f)
                curveTo(4.0706f, 16.157f, 5.1168f, 19.75f, 7.8681f, 19.75f)
                verticalLineTo(18.25f)
                close()
                moveTo(16.1319f, 5.75f)
                curveTo(17.3824f, 5.75f, 17.858f, 7.3832f, 16.803f, 8.0546f)
                lineTo(17.6083f, 9.3201f)
                curveTo(19.9294f, 7.843f, 18.8831f, 4.25f, 16.1319f, 4.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(9.5973f, 12.64f)
                lineTo(6.3917f, 14.6799f)
                lineTo(7.197f, 15.9454f)
                lineTo(10.4027f, 13.9055f)
                lineTo(9.5973f, 12.64f)
                close()
                moveTo(16.803f, 8.0546f)
                lineTo(13.2001f, 10.3473f)
                lineTo(14.0055f, 11.6128f)
                lineTo(17.6083f, 9.3201f)
                lineTo(16.803f, 8.0546f)
                close()
            }
        }
        .build()
        return _routing3!!
    }

private var _routing3: ImageVector? = null
