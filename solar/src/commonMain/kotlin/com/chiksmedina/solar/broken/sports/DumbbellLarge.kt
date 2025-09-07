package com.chiksmedina.solar.broken.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.SportsGroup

val SportsGroup.DumbbellLarge: ImageVector
    get() {
        if (_dumbbellLarge != null) {
            return _dumbbellLarge!!
        }
        _dumbbellLarge = Builder(
            name = "DumbbellLarge", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.3927f, 20.0756f)
                curveTo(6.0849f, 20.7677f, 6.431f, 21.1138f, 6.861f, 21.1138f)
                curveTo(7.291f, 21.1138f, 7.6371f, 20.7677f, 8.3293f, 20.0756f)
                curveTo(8.532f, 19.8728f, 8.8607f, 19.8728f, 9.0634f, 20.0756f)
                lineTo(9.7976f, 20.8097f)
                curveTo(10.4837f, 21.4959f, 10.8268f, 21.8389f, 11.2299f, 21.9469f)
                curveTo(11.4939f, 22.0177f, 11.7719f, 22.0177f, 12.036f, 21.9469f)
                curveTo(12.4391f, 21.8389f, 12.7821f, 21.4959f, 13.4683f, 20.8097f)
                curveTo(14.1544f, 20.1236f, 14.4975f, 19.7805f, 14.6055f, 19.3774f)
                curveTo(14.6763f, 19.1134f, 14.6763f, 18.8353f, 14.6055f, 18.5713f)
                curveTo(14.4975f, 18.1682f, 14.1544f, 17.8251f, 13.4683f, 17.139f)
                lineTo(12.3671f, 16.0378f)
                lineTo(16.0378f, 12.3671f)
                moveTo(18.6073f, 3.9244f)
                curveTo(17.9151f, 3.2323f, 17.5691f, 2.8862f, 17.139f, 2.8862f)
                curveTo(16.709f, 2.8862f, 16.3629f, 3.2323f, 15.6707f, 3.9244f)
                moveTo(21.1138f, 6.861f)
                curveTo(21.1138f, 7.291f, 20.7677f, 7.6371f, 20.0756f, 8.3293f)
                curveTo(19.8728f, 8.532f, 19.8728f, 8.8607f, 20.0756f, 9.0634f)
                lineTo(20.8097f, 9.7976f)
                curveTo(21.4959f, 10.4837f, 21.8389f, 10.8268f, 21.9469f, 11.2299f)
                curveTo(22.0177f, 11.4939f, 22.0177f, 11.7719f, 21.9469f, 12.036f)
                curveTo(21.8389f, 12.4391f, 21.4959f, 12.7821f, 20.8097f, 13.4683f)
                curveTo(20.1236f, 14.1544f, 19.7805f, 14.4975f, 19.3774f, 14.6055f)
                curveTo(19.1134f, 14.6763f, 18.8353f, 14.6763f, 18.5713f, 14.6055f)
                curveTo(18.1682f, 14.4975f, 17.8251f, 14.1544f, 17.139f, 13.4683f)
                lineTo(16.0378f, 12.3671f)
                moveTo(3.9244f, 15.6707f)
                curveTo(3.2323f, 16.3629f, 2.8862f, 16.709f, 2.8862f, 17.139f)
                moveTo(6.4939f, 17.5061f)
                lineTo(3.1903f, 14.2024f)
                curveTo(2.5041f, 13.5163f, 2.1611f, 13.1732f, 2.0531f, 12.7701f)
                curveTo(1.9823f, 12.5061f, 1.9823f, 12.2281f, 2.0531f, 11.964f)
                curveTo(2.1611f, 11.5609f, 2.5041f, 11.2179f, 3.1903f, 10.5317f)
                curveTo(3.8764f, 9.8456f, 4.2195f, 9.5025f, 4.6226f, 9.3945f)
                curveTo(4.8866f, 9.3237f, 5.1646f, 9.3237f, 5.4287f, 9.3945f)
                curveTo(5.8318f, 9.5025f, 6.1749f, 9.8456f, 6.861f, 10.5317f)
                lineTo(7.9622f, 11.6329f)
                moveTo(17.5061f, 6.4939f)
                lineTo(14.2024f, 3.1903f)
                curveTo(13.5163f, 2.5041f, 13.1732f, 2.1611f, 12.7701f, 2.0531f)
                curveTo(12.5061f, 1.9823f, 12.2281f, 1.9823f, 11.964f, 2.0531f)
                curveTo(11.5609f, 2.1611f, 11.2179f, 2.5041f, 10.5317f, 3.1903f)
                curveTo(9.8456f, 3.8764f, 9.5025f, 4.2195f, 9.3945f, 4.6226f)
                curveTo(9.3237f, 4.8866f, 9.3237f, 5.1646f, 9.3945f, 5.4287f)
                curveTo(9.5025f, 5.8318f, 9.8456f, 6.1749f, 10.5317f, 6.861f)
                lineTo(11.6329f, 7.9622f)
                lineTo(7.9622f, 11.6329f)
                moveTo(16.0378f, 12.3671f)
                lineTo(13.8354f, 10.1646f)
                moveTo(7.9622f, 11.6329f)
                lineTo(10.1646f, 13.8354f)
            }
        }
            .build()
        return _dumbbellLarge!!
    }

private var _dumbbellLarge: ImageVector? = null
