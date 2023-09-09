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

public val ArrowsGroup.RoundTransferDiagonal: ImageVector
    get() {
        if (_roundTransferDiagonal != null) {
            return _roundTransferDiagonal!!
        }
        _roundTransferDiagonal = Builder(name = "RoundTransferDiagonal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 8.8764f, 3.4322f, 6.0873f, 5.6757f, 4.2534f)
                lineTo(13.3284f, 12.5099f)
                curveTo(13.5381f, 12.7362f, 13.865f, 12.811f, 14.1523f, 12.6983f)
                curveTo(14.4395f, 12.5857f, 14.6284f, 12.3086f, 14.6284f, 12.0001f)
                verticalLineTo(7.5001f)
                curveTo(14.6284f, 7.0859f, 14.2926f, 6.7501f, 13.8784f, 6.7501f)
                curveTo(13.4642f, 6.7501f, 13.1284f, 7.0859f, 13.1284f, 7.5001f)
                verticalLineTo(10.0876f)
                lineTo(6.9172f, 3.3863f)
                curveTo(8.4066f, 2.5055f, 10.1443f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 15.1255f, 20.5661f, 17.9162f, 18.3202f, 19.7499f)
                lineTo(10.4207f, 11.4818f)
                curveTo(10.209f, 11.2603f, 9.8838f, 11.1898f, 9.5993f, 11.3038f)
                curveTo(9.3149f, 11.4179f, 9.1284f, 11.6935f, 9.1284f, 12.0f)
                verticalLineTo(16.5f)
                curveTo(9.1284f, 16.9142f, 9.4642f, 17.25f, 9.8784f, 17.25f)
                curveTo(10.2926f, 17.25f, 10.6284f, 16.9142f, 10.6284f, 16.5f)
                verticalLineTo(13.8706f)
                lineTo(17.0752f, 20.6182f)
                curveTo(15.5875f, 21.4962f, 13.8526f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _roundTransferDiagonal!!
    }

private var _roundTransferDiagonal: ImageVector? = null
