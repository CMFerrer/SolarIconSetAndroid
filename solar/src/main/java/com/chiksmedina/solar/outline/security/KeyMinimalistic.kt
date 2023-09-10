package com.chiksmedina.solar.outline.security

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SecurityGroup

val SecurityGroup.KeyMinimalistic: ImageVector
    get() {
        if (_keyMinimalistic != null) {
            return _keyMinimalistic!!
        }
        _keyMinimalistic = Builder(
            name = "KeyMinimalistic", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(8.6793f, 4.4926f)
                curveTo(11.6694f, 1.5025f, 16.5173f, 1.5025f, 19.5074f, 4.4926f)
                curveTo(22.4975f, 7.4827f, 22.4975f, 12.3306f, 19.5074f, 15.3207f)
                curveTo(17.5214f, 17.3068f, 14.716f, 17.9728f, 12.1823f, 17.3221f)
                curveTo(12.0324f, 17.2836f, 11.9181f, 17.3287f, 11.8623f, 17.3845f)
                lineTo(8.1499f, 21.0968f)
                curveTo(7.6709f, 21.5759f, 7.0001f, 21.8112f, 6.3268f, 21.7364f)
                lineTo(4.2382f, 21.5043f)
                curveTo(3.8463f, 21.4607f, 3.4808f, 21.2851f, 3.202f, 21.0063f)
                lineTo(2.9938f, 20.798f)
                curveTo(2.7149f, 20.5192f, 2.5393f, 20.1537f, 2.4957f, 19.7618f)
                lineTo(2.2636f, 17.6732f)
                curveTo(2.1888f, 16.9999f, 2.4241f, 16.3291f, 2.9032f, 15.8501f)
                lineTo(6.6153f, 12.138f)
                curveTo(6.6713f, 12.082f, 6.7163f, 11.9672f, 6.6779f, 11.8177f)
                curveTo(6.0272f, 9.284f, 6.6932f, 6.4787f, 8.6793f, 4.4926f)
                close()
                moveTo(18.4468f, 5.5532f)
                curveTo(16.0424f, 3.1489f, 12.1443f, 3.1489f, 9.7399f, 5.5532f)
                curveTo(8.1441f, 7.1491f, 7.6066f, 9.4033f, 8.1307f, 11.4446f)
                curveTo(8.2818f, 12.0329f, 8.1586f, 12.716f, 7.6759f, 13.1987f)
                lineTo(3.9638f, 16.9108f)
                curveTo(3.807f, 17.0676f, 3.73f, 17.2872f, 3.7545f, 17.5076f)
                lineTo(3.9866f, 19.5962f)
                curveTo(3.9925f, 19.6496f, 4.0164f, 19.6994f, 4.0544f, 19.7374f)
                lineTo(4.2626f, 19.9456f)
                curveTo(4.3006f, 19.9836f, 4.3504f, 20.0075f, 4.4038f, 20.0135f)
                lineTo(6.4924f, 20.2455f)
                curveTo(6.7128f, 20.27f, 6.9324f, 20.193f, 7.0892f, 20.0362f)
                lineTo(7.7964f, 19.329f)
                lineTo(6.5835f, 18.1294f)
                curveTo(6.289f, 17.8382f, 6.2864f, 17.3633f, 6.5777f, 17.0688f)
                curveTo(6.869f, 16.7743f, 7.3438f, 16.7717f, 7.6383f, 17.063f)
                lineTo(8.857f, 18.2684f)
                lineTo(10.8016f, 16.3238f)
                curveTo(11.2845f, 15.8409f, 11.9675f, 15.7183f, 12.5554f, 15.8693f)
                curveTo(14.5967f, 16.3934f, 16.851f, 15.8559f, 18.4468f, 14.2601f)
                curveTo(20.8511f, 11.8557f, 20.8511f, 7.9576f, 18.4468f, 5.5532f)
                close()
                moveTo(12.0555f, 8.0555f)
                curveTo(13.1294f, 6.9815f, 14.8706f, 6.9815f, 15.9445f, 8.0555f)
                curveTo(17.0185f, 9.1294f, 17.0185f, 10.8706f, 15.9445f, 11.9445f)
                curveTo(14.8706f, 13.0185f, 13.1294f, 13.0185f, 12.0555f, 11.9445f)
                curveTo(10.9815f, 10.8706f, 10.9815f, 9.1294f, 12.0555f, 8.0555f)
                close()
                moveTo(14.8839f, 9.1161f)
                curveTo(14.3957f, 8.628f, 13.6043f, 8.628f, 13.1161f, 9.1161f)
                curveTo(12.628f, 9.6043f, 12.628f, 10.3957f, 13.1161f, 10.8839f)
                curveTo(13.6043f, 11.372f, 14.3957f, 11.372f, 14.8839f, 10.8839f)
                curveTo(15.372f, 10.3957f, 15.372f, 9.6043f, 14.8839f, 9.1161f)
                close()
            }
        }
            .build()
        return _keyMinimalistic!!
    }

private var _keyMinimalistic: ImageVector? = null
