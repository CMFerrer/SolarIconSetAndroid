package dev.chiksmedina.solar.bold.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.SportsGroup

val SportsGroup.Water: ImageVector
    get() {
        if (_water != null) {
            return _water!!
        }
        _water = Builder(
            name = "Water", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(4.5816f, 6.0104f)
                curveTo(5.2723f, 4.9947f, 6.7152f, 5.0326f, 7.4435f, 5.9094f)
                curveTo(8.4255f, 7.0915f, 9.8098f, 8.2498f, 12.0f, 8.2498f)
                curveTo(14.2278f, 8.2498f, 15.591f, 7.32f, 16.5186f, 6.1537f)
                curveTo(17.24f, 5.2467f, 18.7775f, 5.101f, 19.5336f, 6.1769f)
                curveTo(20.152f, 7.0569f, 20.828f, 7.7578f, 22.1623f, 8.0535f)
                curveTo(22.5667f, 8.1432f, 22.8219f, 8.5436f, 22.7323f, 8.948f)
                curveTo(22.6427f, 9.3524f, 22.2422f, 9.6076f, 21.8378f, 9.518f)
                curveTo(19.9968f, 9.11f, 19.0391f, 8.0821f, 18.3063f, 7.0394f)
                curveTo(18.2577f, 6.9702f, 18.1709f, 6.9192f, 18.0399f, 6.9215f)
                curveTo(17.9038f, 6.9239f, 17.7731f, 6.9862f, 17.6925f, 7.0875f)
                curveTo(16.5172f, 8.5651f, 14.7411f, 9.7498f, 12.0f, 9.7498f)
                curveTo(9.1772f, 9.7498f, 7.4107f, 8.2175f, 6.2896f, 6.8678f)
                lineTo(6.8665f, 6.3886f)
                lineTo(6.2896f, 6.8678f)
                curveTo(6.2244f, 6.7893f, 6.1274f, 6.7479f, 6.0287f, 6.7499f)
                curveTo(5.9334f, 6.7518f, 5.864f, 6.792f, 5.8219f, 6.8539f)
                curveTo(5.0757f, 7.9511f, 4.1184f, 9.0845f, 2.1623f, 9.518f)
                curveTo(1.7579f, 9.6076f, 1.3574f, 9.3524f, 1.2678f, 8.948f)
                curveTo(1.1782f, 8.5436f, 1.4334f, 8.1432f, 1.8378f, 8.0535f)
                curveTo(3.2497f, 7.7406f, 3.9259f, 6.9743f, 4.5816f, 6.0104f)
                close()
                moveTo(4.5816f, 11.0104f)
                curveTo(5.2723f, 9.9947f, 6.7152f, 10.0326f, 7.4435f, 10.9094f)
                curveTo(8.4255f, 12.0915f, 9.8098f, 13.2498f, 12.0f, 13.2498f)
                curveTo(14.2278f, 13.2498f, 15.591f, 12.3199f, 16.5186f, 11.1537f)
                curveTo(17.24f, 10.2467f, 18.7775f, 10.101f, 19.5336f, 11.1769f)
                curveTo(20.152f, 12.0569f, 20.828f, 12.7578f, 22.1623f, 13.0535f)
                curveTo(22.5667f, 13.1431f, 22.8219f, 13.5436f, 22.7323f, 13.948f)
                curveTo(22.6427f, 14.3524f, 22.2422f, 14.6076f, 21.8378f, 14.518f)
                curveTo(19.9968f, 14.11f, 19.0391f, 13.0821f, 18.3063f, 12.0394f)
                curveTo(18.2577f, 11.9702f, 18.1709f, 11.9192f, 18.0399f, 11.9215f)
                curveTo(17.9038f, 11.9239f, 17.7731f, 11.9862f, 17.6925f, 12.0875f)
                curveTo(16.5172f, 13.5651f, 14.7411f, 14.7498f, 12.0f, 14.7498f)
                curveTo(9.1772f, 14.7498f, 7.4107f, 13.2175f, 6.2896f, 11.8678f)
                curveTo(6.2244f, 11.7893f, 6.1274f, 11.7479f, 6.0287f, 11.7499f)
                curveTo(5.9334f, 11.7518f, 5.864f, 11.792f, 5.8219f, 11.8539f)
                curveTo(5.0757f, 12.9511f, 4.1184f, 14.0845f, 2.1623f, 14.518f)
                curveTo(1.7579f, 14.6076f, 1.3574f, 14.3524f, 1.2678f, 13.948f)
                curveTo(1.1782f, 13.5436f, 1.4334f, 13.1431f, 1.8378f, 13.0535f)
                curveTo(3.2497f, 12.7406f, 3.9259f, 11.9744f, 4.5816f, 11.0104f)
                close()
                moveTo(4.5816f, 16.0104f)
                curveTo(5.2723f, 14.9947f, 6.7152f, 15.0326f, 7.4435f, 15.9094f)
                curveTo(8.4255f, 17.0915f, 9.8098f, 18.2498f, 12.0f, 18.2498f)
                curveTo(14.2278f, 18.2498f, 15.591f, 17.3199f, 16.5186f, 16.1537f)
                curveTo(17.24f, 15.2467f, 18.7775f, 15.101f, 19.5336f, 16.1769f)
                curveTo(20.152f, 17.0569f, 20.828f, 17.7578f, 22.1623f, 18.0535f)
                curveTo(22.5667f, 18.1431f, 22.8219f, 18.5436f, 22.7323f, 18.948f)
                curveTo(22.6427f, 19.3524f, 22.2422f, 19.6076f, 21.8378f, 19.518f)
                curveTo(19.9968f, 19.11f, 19.0391f, 18.0821f, 18.3063f, 17.0394f)
                curveTo(18.2577f, 16.9702f, 18.1709f, 16.9192f, 18.0399f, 16.9215f)
                curveTo(17.9038f, 16.9239f, 17.7731f, 16.9862f, 17.6925f, 17.0875f)
                curveTo(16.5172f, 18.5651f, 14.7411f, 19.7498f, 12.0f, 19.7498f)
                curveTo(9.1772f, 19.7498f, 7.4107f, 18.2175f, 6.2896f, 16.8678f)
                curveTo(6.2244f, 16.7893f, 6.1274f, 16.7479f, 6.0287f, 16.7499f)
                curveTo(5.9334f, 16.7518f, 5.864f, 16.792f, 5.8219f, 16.8539f)
                curveTo(5.0757f, 17.9511f, 4.1184f, 19.0845f, 2.1623f, 19.518f)
                curveTo(1.7579f, 19.6076f, 1.3574f, 19.3524f, 1.2678f, 18.948f)
                curveTo(1.1782f, 18.5436f, 1.4334f, 18.1431f, 1.8378f, 18.0535f)
                curveTo(3.2497f, 17.7406f, 3.9259f, 16.9744f, 4.5816f, 16.0104f)
                close()
            }
        }
            .build()
        return _water!!
    }

private var _water: ImageVector? = null
