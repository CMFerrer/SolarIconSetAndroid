package com.chiksmedina.solar.bold.files

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.FilesGroup

val FilesGroup.FileCorrupted: ImageVector
    get() {
        if (_fileCorrupted != null) {
            return _fileCorrupted!!
        }
        _fileCorrupted = Builder(
            name = "FileCorrupted", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.3517f, 7.6167f)
                lineTo(15.3929f, 4.0538f)
                curveTo(14.2651f, 3.0387f, 13.7012f, 2.5311f, 13.0092f, 2.2656f)
                lineTo(13.0f, 5.0001f)
                curveTo(13.0f, 7.3571f, 13.0f, 8.5356f, 13.7322f, 9.2679f)
                curveTo(14.4645f, 10.0001f, 15.643f, 10.0001f, 18.0f, 10.0001f)
                horizontalLineTo(21.5801f)
                curveTo(21.2175f, 9.2959f, 20.5684f, 8.7116f, 19.3517f, 7.6167f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.7255f, 20.3823f, 2.4492f, 19.8327f, 2.2782f, 19.1149f)
                curveTo(2.159f, 18.6149f, 2.0995f, 18.3649f, 2.2143f, 18.0728f)
                curveTo(2.3291f, 17.7806f, 2.5822f, 17.6119f, 3.0883f, 17.2745f)
                lineTo(3.7143f, 16.8571f)
                curveTo(4.4928f, 16.3381f, 5.5072f, 16.3381f, 6.2857f, 16.8571f)
                curveTo(7.3238f, 17.5492f, 8.6762f, 17.5492f, 9.7143f, 16.8571f)
                curveTo(10.4929f, 16.3381f, 11.5071f, 16.3381f, 12.2857f, 16.8571f)
                curveTo(13.3238f, 17.5492f, 14.6762f, 17.5492f, 15.7143f, 16.8571f)
                curveTo(16.4929f, 16.3381f, 17.5071f, 16.3381f, 18.2857f, 16.8571f)
                curveTo(19.3238f, 17.5492f, 20.6762f, 17.5492f, 21.7143f, 16.8571f)
                curveTo(21.8241f, 16.7839f, 21.9705f, 16.8681f, 21.965f, 17.0f)
                curveTo(21.8873f, 18.8723f, 21.6366f, 20.0203f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 10.0f)
                curveTo(2.0f, 6.2288f, 2.0f, 4.3432f, 3.1716f, 3.1716f)
                curveTo(4.3432f, 2.0f, 6.2387f, 2.0f, 10.0298f, 2.0f)
                curveTo(10.6358f, 2.0f, 11.1214f, 2.0f, 11.53f, 2.0167f)
                curveTo(11.5166f, 2.0966f, 11.5095f, 2.1781f, 11.5092f, 2.2606f)
                lineTo(11.5f, 5.095f)
                curveTo(11.4999f, 6.1921f, 11.4998f, 7.1616f, 11.6049f, 7.9432f)
                curveTo(11.7188f, 8.7903f, 11.9803f, 9.6373f, 12.6716f, 10.3285f)
                curveTo(13.3628f, 11.0198f, 14.2098f, 11.2813f, 15.0569f, 11.3952f)
                curveTo(15.8385f, 11.5003f, 16.808f, 11.5002f, 17.9051f, 11.5001f)
                lineTo(18.0f, 11.5001f)
                horizontalLineTo(21.9934f)
                verticalLineTo(12.3273f)
                curveTo(21.9973f, 12.5399f, 21.8912f, 12.7392f, 21.7143f, 12.8571f)
                curveTo(20.6762f, 13.5492f, 19.3238f, 13.5492f, 18.2857f, 12.8571f)
                curveTo(17.5071f, 12.3381f, 16.4929f, 12.3381f, 15.7143f, 12.8571f)
                curveTo(14.6762f, 13.5492f, 13.3238f, 13.5492f, 12.2857f, 12.8571f)
                curveTo(11.5071f, 12.3381f, 10.4929f, 12.3381f, 9.7143f, 12.8571f)
                curveTo(8.6762f, 13.5492f, 7.3238f, 13.5492f, 6.2857f, 12.8571f)
                curveTo(5.5072f, 12.3381f, 4.4928f, 12.3381f, 3.7143f, 12.8571f)
                lineTo(3.5547f, 12.9635f)
                curveTo(2.8703f, 13.4198f, 2.5281f, 13.6479f, 2.2641f, 13.5066f)
                curveTo(2.0f, 13.3653f, 2.0f, 12.954f, 2.0f, 12.1315f)
                verticalLineTo(10.0f)
                close()
            }
        }
            .build()
        return _fileCorrupted!!
    }

private var _fileCorrupted: ImageVector? = null
