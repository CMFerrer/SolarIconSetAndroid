package dev.chiksmedina.solar.boldduotone.textformatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.TextFormattingGroup

val TextFormattingGroup.LinkSquare: ImageVector
    get() {
        if (_linkSquare != null) {
            return _linkSquare!!
        }
        _linkSquare = Builder(
            name = "LinkSquare", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                curveTo(7.286f, 22.0f, 4.9289f, 22.0f, 3.4645f, 20.5355f)
                curveTo(2.0f, 19.0711f, 2.0f, 16.714f, 2.0f, 12.0f)
                curveTo(2.0f, 7.286f, 2.0f, 4.9289f, 3.4645f, 3.4645f)
                curveTo(4.9289f, 2.0f, 7.286f, 2.0f, 12.0f, 2.0f)
                curveTo(16.714f, 2.0f, 19.0711f, 2.0f, 20.5355f, 3.4645f)
                curveTo(22.0f, 4.9289f, 22.0f, 7.286f, 22.0f, 12.0f)
                curveTo(22.0f, 16.714f, 22.0f, 19.0711f, 20.5355f, 20.5355f)
                curveTo(19.0711f, 22.0f, 16.714f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.198f, 7.25f)
                horizontalLineTo(9.302f)
                horizontalLineTo(9.3021f)
                curveTo(10.2005f, 7.25f, 10.9497f, 7.2499f, 11.5445f, 7.3299f)
                curveTo(12.1723f, 7.4143f, 12.7391f, 7.6f, 13.1945f, 8.0555f)
                curveTo(13.65f, 8.5109f, 13.8357f, 9.0777f, 13.9201f, 9.7055f)
                curveTo(14.0001f, 10.3003f, 14.0f, 11.0495f, 14.0f, 11.948f)
                lineTo(14.0f, 12.0f)
                curveTo(14.0f, 12.4142f, 13.6642f, 12.75f, 13.25f, 12.75f)
                curveTo(12.8358f, 12.75f, 12.5f, 12.4142f, 12.5f, 12.0f)
                curveTo(12.5f, 11.036f, 12.4984f, 10.3884f, 12.4335f, 9.9054f)
                curveTo(12.3714f, 9.4439f, 12.2642f, 9.2464f, 12.1339f, 9.1161f)
                curveTo(12.0036f, 8.9858f, 11.8061f, 8.8786f, 11.3446f, 8.8165f)
                curveTo(10.8616f, 8.7516f, 10.214f, 8.75f, 9.25f, 8.75f)
                curveTo(8.286f, 8.75f, 7.6384f, 8.7516f, 7.1554f, 8.8165f)
                curveTo(6.6939f, 8.8786f, 6.4964f, 8.9858f, 6.3661f, 9.1161f)
                curveTo(6.2358f, 9.2464f, 6.1286f, 9.4439f, 6.0665f, 9.9054f)
                curveTo(6.0016f, 10.3884f, 6.0f, 11.036f, 6.0f, 12.0f)
                curveTo(6.0f, 12.964f, 6.0016f, 13.6116f, 6.0665f, 14.0946f)
                curveTo(6.1286f, 14.5561f, 6.2358f, 14.7536f, 6.3661f, 14.8839f)
                curveTo(6.4964f, 15.0142f, 6.6939f, 15.1214f, 7.1554f, 15.1835f)
                curveTo(7.6384f, 15.2484f, 8.286f, 15.25f, 9.25f, 15.25f)
                curveTo(9.6642f, 15.25f, 10.0f, 15.5858f, 10.0f, 16.0f)
                curveTo(10.0f, 16.4142f, 9.6642f, 16.75f, 9.25f, 16.75f)
                lineTo(9.198f, 16.75f)
                curveTo(8.2995f, 16.75f, 7.5503f, 16.7501f, 6.9555f, 16.6701f)
                curveTo(6.3277f, 16.5857f, 5.7609f, 16.4f, 5.3055f, 15.9445f)
                curveTo(4.85f, 15.4891f, 4.6643f, 14.9223f, 4.5799f, 14.2945f)
                curveTo(4.4999f, 13.6997f, 4.5f, 12.9505f, 4.5f, 12.052f)
                verticalLineTo(12.052f)
                verticalLineTo(11.948f)
                verticalLineTo(11.9479f)
                curveTo(4.5f, 11.0495f, 4.4999f, 10.3003f, 4.5799f, 9.7055f)
                curveTo(4.6643f, 9.0777f, 4.85f, 8.5109f, 5.3055f, 8.0555f)
                curveTo(5.7609f, 7.6f, 6.3277f, 7.4143f, 6.9555f, 7.3299f)
                curveTo(7.5503f, 7.2499f, 8.2995f, 7.25f, 9.198f, 7.25f)
                horizontalLineTo(9.198f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.8446f, 8.8165f)
                curveTo(16.3616f, 8.7516f, 15.714f, 8.75f, 14.75f, 8.75f)
                curveTo(14.3358f, 8.75f, 14.0f, 8.4142f, 14.0f, 8.0f)
                curveTo(14.0f, 7.5858f, 14.3358f, 7.25f, 14.75f, 7.25f)
                lineTo(14.802f, 7.25f)
                horizontalLineTo(14.8021f)
                curveTo(15.7005f, 7.25f, 16.4497f, 7.2499f, 17.0445f, 7.3299f)
                curveTo(17.6723f, 7.4143f, 18.2391f, 7.6f, 18.6945f, 8.0555f)
                curveTo(19.15f, 8.5109f, 19.3357f, 9.0777f, 19.4201f, 9.7055f)
                curveTo(19.5001f, 10.3003f, 19.5f, 11.0495f, 19.5f, 11.9479f)
                verticalLineTo(11.9479f)
                verticalLineTo(12.052f)
                verticalLineTo(12.0521f)
                curveTo(19.5f, 12.9505f, 19.5001f, 13.6997f, 19.4201f, 14.2945f)
                curveTo(19.3357f, 14.9223f, 19.15f, 15.4891f, 18.6945f, 15.9445f)
                curveTo(18.2391f, 16.4f, 17.6723f, 16.5857f, 17.0445f, 16.6701f)
                curveTo(16.4497f, 16.7501f, 15.7005f, 16.75f, 14.802f, 16.75f)
                horizontalLineTo(14.698f)
                curveTo(13.7995f, 16.75f, 13.0503f, 16.7501f, 12.4555f, 16.6701f)
                curveTo(11.8277f, 16.5857f, 11.2609f, 16.4f, 10.8055f, 15.9445f)
                curveTo(10.35f, 15.4891f, 10.1643f, 14.9223f, 10.0799f, 14.2945f)
                curveTo(10.0f, 13.6997f, 10.0f, 12.9505f, 10.0f, 12.052f)
                lineTo(10.0f, 12.0f)
                curveTo(10.0f, 11.5858f, 10.3358f, 11.25f, 10.75f, 11.25f)
                curveTo(11.1642f, 11.25f, 11.5f, 11.5858f, 11.5f, 12.0f)
                curveTo(11.5f, 12.964f, 11.5016f, 13.6116f, 11.5665f, 14.0946f)
                curveTo(11.6286f, 14.5561f, 11.7358f, 14.7536f, 11.8661f, 14.8839f)
                curveTo(11.9964f, 15.0142f, 12.1939f, 15.1214f, 12.6554f, 15.1835f)
                curveTo(13.1384f, 15.2484f, 13.786f, 15.25f, 14.75f, 15.25f)
                curveTo(15.714f, 15.25f, 16.3616f, 15.2484f, 16.8446f, 15.1835f)
                curveTo(17.3061f, 15.1214f, 17.5036f, 15.0142f, 17.6339f, 14.8839f)
                curveTo(17.7642f, 14.7536f, 17.8714f, 14.5561f, 17.9335f, 14.0946f)
                curveTo(17.9984f, 13.6116f, 18.0f, 12.964f, 18.0f, 12.0f)
                curveTo(18.0f, 11.036f, 17.9984f, 10.3884f, 17.9335f, 9.9054f)
                curveTo(17.8714f, 9.4439f, 17.7642f, 9.2464f, 17.6339f, 9.1161f)
                curveTo(17.5036f, 8.9858f, 17.3061f, 8.8786f, 16.8446f, 8.8165f)
                close()
            }
        }
            .build()
        return _linkSquare!!
    }

private var _linkSquare: ImageVector? = null
