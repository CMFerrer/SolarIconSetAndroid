package dev.chiksmedina.solar.linear.maplocation

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
import dev.chiksmedina.solar.linear.MapLocationGroup

val MapLocationGroup.Globus: ImageVector
    get() {
        if (_globus != null) {
            return _globus!!
        }
        _globus = Builder(
            name = "Globus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 10.0f)
                moveToRelative(-7.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 14.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, -14.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 16.5623f)
                curveTo(5.8884f, 18.6722f, 8.6326f, 20.0f, 11.687f, 20.0f)
                curveTo(17.3827f, 20.0f, 22.0f, 15.3827f, 22.0f, 9.687f)
                curveTo(22.0f, 6.6326f, 20.6722f, 3.8884f, 18.5623f, 2.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(7.0f, 4.5526f)
                curveTo(7.5852f, 5.1052f, 8.7907f, 6.6158f, 8.9311f, 8.2368f)
                curveTo(9.0624f, 9.752f, 10.0268f, 10.9832f, 11.5f, 10.9999f)
                curveTo(12.0662f, 11.0063f, 12.6388f, 10.5822f, 12.6373f, 9.995f)
                curveTo(12.6368f, 9.8135f, 12.6079f, 9.6278f, 12.5627f, 9.457f)
                curveTo(12.4998f, 9.2195f, 12.4942f, 8.9462f, 12.625f, 8.6666f)
                curveTo(13.0824f, 7.6886f, 13.982f, 7.4259f, 14.6949f, 6.8948f)
                curveTo(15.0111f, 6.6592f, 15.2995f, 6.4107f, 15.4266f, 6.2105f)
                curveTo(15.7777f, 5.6579f, 16.1289f, 4.5526f, 15.9533f, 4.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 11.0f)
                curveTo(18.7804f, 11.6207f, 18.625f, 13.25f, 16.1455f, 13.2759f)
                curveTo(16.1455f, 13.2759f, 13.9497f, 13.2759f, 13.291f, 14.5172f)
                curveTo(12.764f, 15.5103f, 13.0714f, 16.5862f, 13.291f, 17.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                verticalLineTo(20.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 22.0f)
                horizontalLineTo(10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.0f, 22.0f)
                horizontalLineTo(12.0f)
            }
        }
            .build()
        return _globus!!
    }

private var _globus: ImageVector? = null
