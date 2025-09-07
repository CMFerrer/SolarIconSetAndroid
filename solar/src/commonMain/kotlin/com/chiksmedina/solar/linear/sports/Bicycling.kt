package com.chiksmedina.solar.linear.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.SportsGroup

val SportsGroup.Bicycling: ImageVector
    get() {
        if (_bicycling != null) {
            return _bicycling!!
        }
        _bicycling = Builder(
            name = "Bicycling", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.0f, 4.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.0f, 18.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.0f, 18.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(18.5f, 10.0f)
                horizontalLineTo(16.4744f)
                curveTo(15.2534f, 10.0f, 14.6429f, 10.0f, 14.0934f, 9.7734f)
                curveTo(13.544f, 9.5468f, 13.111f, 9.1165f, 12.2449f, 8.2557f)
                lineTo(11.6676f, 7.6819f)
                curveTo(10.8828f, 6.902f, 10.4904f, 6.512f, 10.0257f, 6.5544f)
                curveTo(9.561f, 6.5967f, 9.2456f, 7.0512f, 8.6147f, 7.9601f)
                lineTo(7.3881f, 9.7274f)
                curveTo(6.7457f, 10.6529f, 6.4245f, 11.1156f, 6.5535f, 11.5703f)
                curveTo(6.6824f, 12.025f, 7.1987f, 12.2503f, 8.2312f, 12.7009f)
                lineTo(9.707f, 13.3448f)
                curveTo(11.0709f, 13.9399f, 11.7529f, 14.2375f, 12.081f, 14.8374f)
                curveTo(12.4091f, 15.4373f, 12.2918f, 16.172f, 12.0572f, 17.6416f)
                lineTo(12.0f, 18.0f)
            }
        }
            .build()
        return _bicycling!!
    }

private var _bicycling: ImageVector? = null
