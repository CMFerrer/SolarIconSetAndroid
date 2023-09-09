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

public val ArrowsGroup.RoundTransferDiagonal: ImageVector
    get() {
        if (_roundTransferDiagonal != null) {
            return _roundTransferDiagonal!!
        }
        _roundTransferDiagonal = Builder(name = "RoundTransferDiagonal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(13.8526f, 22.0f, 15.5875f, 21.4962f, 17.0752f, 20.6182f)
                curveTo(17.0775f, 20.6169f, 17.0797f, 20.6156f, 17.0819f, 20.6143f)
                curveTo(17.5169f, 20.3571f, 17.9308f, 20.0679f, 18.3202f, 19.7499f)
                curveTo(20.5661f, 17.9162f, 22.0f, 15.1255f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(10.1443f, 2.0f, 8.4066f, 2.5055f, 6.9172f, 3.3863f)
                curveTo(6.8829f, 3.4066f, 6.8487f, 3.4271f, 6.8146f, 3.4477f)
                curveTo(6.4158f, 3.69f, 6.0353f, 3.9595f, 5.6757f, 4.2534f)
                curveTo(3.4322f, 6.0873f, 2.0f, 8.8764f, 2.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.1285f, 7.5005f)
                verticalLineTo(10.0881f)
                lineTo(6.9173f, 3.3867f)
                curveTo(6.4811f, 3.6447f, 6.0661f, 3.9348f, 5.6758f, 4.2539f)
                lineTo(13.3285f, 12.5104f)
                curveTo(13.5382f, 12.7367f, 13.8651f, 12.8114f, 14.1524f, 12.6988f)
                curveTo(14.4396f, 12.5861f, 14.6285f, 12.3091f, 14.6285f, 12.0005f)
                verticalLineTo(7.5005f)
                curveTo(14.6285f, 7.0863f, 14.2928f, 6.7505f, 13.8785f, 6.7505f)
                curveTo(13.4643f, 6.7505f, 13.1285f, 7.0863f, 13.1285f, 7.5005f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.4208f, 11.4823f)
                curveTo(10.2091f, 11.2607f, 9.8839f, 11.1902f, 9.5994f, 11.3043f)
                curveTo(9.315f, 11.4183f, 9.1285f, 11.6939f, 9.1285f, 12.0004f)
                verticalLineTo(16.5004f)
                curveTo(9.1285f, 16.9146f, 9.4643f, 17.2504f, 9.8785f, 17.2504f)
                curveTo(10.2928f, 17.2504f, 10.6285f, 16.9146f, 10.6285f, 16.5004f)
                verticalLineTo(13.8711f)
                lineTo(17.0753f, 20.6187f)
                curveTo(17.5128f, 20.3605f, 17.9289f, 20.0699f, 18.3203f, 19.7503f)
                lineTo(10.4208f, 11.4823f)
                close()
            }
        }
        .build()
        return _roundTransferDiagonal!!
    }

private var _roundTransferDiagonal: ImageVector? = null
